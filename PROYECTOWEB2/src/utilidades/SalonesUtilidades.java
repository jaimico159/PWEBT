package utilidades;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Query;
import java.util.ArrayList;

import estructura.DSF;
import estructura.Salones;

public class SalonesUtilidades {
	public static void add(int grado,String seccion){
		DatastoreService a = DSF.getDatastoreService();
		Salones b = new Salones(grado,seccion);
		a.put(b.getEntity());
	}
	public static ArrayList<Key> lista(){
		DatastoreService data = DSF.getDatastoreService();
		Query q = new Query(Salones.ENTIDAD).setKeysOnly();
		final ArrayList<Entity> entidades = new ArrayList<Entity>();
		final ArrayList<Key> claves = new ArrayList<Key>();
		data.prepare(q);
		for (Entity k: data.prepare(q).asIterable()) {
			// conversion de las entidades a tutoriales
			entidades.add((Entity)k);
		}
		for(int i=0;i<entidades.size();i++){
			claves.add((Key)entidades.get(i).getKey());
		}
		return claves;
	}
}
