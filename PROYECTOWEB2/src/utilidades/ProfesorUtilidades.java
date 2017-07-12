package utilidades;

import com.google.appengine.api.datastore.DatastoreService;

import estructura.DSF;
import estructura.Profesor;

public class ProfesorUtilidades {
	public static void add(String nombres, String ap_paterno,String ap_materno,int dni,String correo,String tipo,boolean condicion){
		DatastoreService a = DSF.getDatastoreService();
		Profesor x = new Profesor(nombres,ap_paterno,ap_materno,dni,correo,tipo,condicion);
		a.put(x.getEntity());
		a.put(x.getEntity1());
	}
}