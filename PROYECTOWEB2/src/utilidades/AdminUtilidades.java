package utilidades;

import estructura.Administrador;
import estructura.Ciencias;
import estructura.DSF;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.appengine.api.datastore.*;
import com.google.appengine.api.datastore.Query.*;


public class AdminUtilidades {
	public static void add(String nombres, String ap_paterno,String ap_materno,int dni,String correo,String tipo,boolean condicion){
		DatastoreService a = DSF.getDatastoreService();
		Administrador x = new Administrador(nombres,ap_paterno,ap_materno,dni,correo,tipo,condicion);
		a.put(x.getCorreo().getEntity());
		a.put(x.getEntity());
		a.put(x.getEntity1());
	}
}
