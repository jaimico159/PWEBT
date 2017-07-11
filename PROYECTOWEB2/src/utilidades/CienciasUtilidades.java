package utilidades;

import estructura.Ciencias;
import estructura.DSF;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.appengine.api.datastore.*;
import com.google.appengine.api.datastore.Query.*;


public class CienciasUtilidades {
	public static void add(DatastoreService a,Key cod_salon, Date Fecha, ArrayList<Key> notas){
		Ciencias x = new Ciencias(cod_salon,Fecha,notas);
		a.put(x.getEntity());
	}
	public static void add(DatastoreService a,Ciencias b){
		
	}
	public static void update(DatastoreService a,Key ciencias,Key cod_salon, Date Fecha, ArrayList<Key> notas) throws EntityNotFoundException{
		Entity x = a.get(ciencias);
		x.setProperty(Ciencias.COD_SALON, cod_salon);
		x.setProperty(Ciencias.FECHA,Fecha);
		x.setProperty(Ciencias.NOTAS, notas);
	}
	public static void delete(DatastoreService a, Key ciencias){
		a.delete(ciencias);
	}
}
