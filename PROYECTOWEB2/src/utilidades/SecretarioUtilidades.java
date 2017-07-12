package utilidades;

import com.google.appengine.api.datastore.DatastoreService;

import estructura.DSF;
import estructura.Secretario;

public class SecretarioUtilidades {
	public static void add(String nombres, String ap_paterno,String ap_materno,int dni,String correo,String tipo,boolean condicion){
		DatastoreService a = DSF.getDatastoreService();
		Secretario x = new Secretario(nombres,ap_paterno,ap_materno,dni,correo,tipo,condicion);
		a.put(x.getEntity());
		a.put(x.getEntity1());
	}
}