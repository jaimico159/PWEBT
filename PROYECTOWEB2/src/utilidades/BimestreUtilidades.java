package utilidades;

import com.google.appengine.api.datastore.DatastoreService;

import estructura.Bimestre;

public class BimestreUtilidades {
	public static void add(DatastoreService a){
		Bimestre x = new Bimestre();
		a.put(x.getEntity());
	}
	
}
