package utilidades;
import estructura.Curso_nota;
import estructura.DSF;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.appengine.api.datastore.*;
import com.google.appengine.api.datastore.Query.*;

public class CursoNotaUtilidades {
	public static void add(DatastoreService a, Key curso,int nota ){
		Curso_nota x = new Curso_nota(curso,nota);
		a.put(x.getEntity());
	}
	public static void add(DatastoreService a, Curso_nota b){
		a.put(b.getEntity());
	}
	public static void update(DatastoreService a, Key curso,int nota) throws EntityNotFoundException{
		Entity x = a.get(curso);
		x.setProperty(Curso_nota.VALOR_NOTA, nota);
		a.put(x);
	}
	public static void delete(DatastoreService a, Key curso){
		a.delete(curso);
	}
	
}
