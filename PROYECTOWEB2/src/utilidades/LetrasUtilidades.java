package utilidades;

import java.util.ArrayList;
import java.util.Date;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.EntityNotFoundException;
import com.google.appengine.api.datastore.Key;

import estructura.Letras;

public class LetrasUtilidades {
	public static void add(DatastoreService a,Key cod_salon, Date Fecha, ArrayList<Key> notas){
		Letras x = new Letras(cod_salon,Fecha,notas);
		a.put(x.getEntity());
	}
	public static void update(DatastoreService a,Key ciencias,Key cod_salon, Date Fecha, ArrayList<Key> notas) throws EntityNotFoundException{
		Entity x = a.get(ciencias);
		x.setProperty(Letras.COD_SALON, cod_salon);
		x.setProperty(Letras.FECHA,Fecha);
		x.setProperty(Letras.NOTAS, notas);
	}
	public static void delete(DatastoreService a, Key letras){
		a.delete(letras);
	}
}
