package utilidades;

import com.google.appengine.api.datastore.DatastoreService;

import estructura.Notas;

public class NotasUtilidades {
	public static void add(DatastoreService a){
		Notas x = new Notas();
		a.put(x.getEntity());
	}
}
