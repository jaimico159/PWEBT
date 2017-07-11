package estructura;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;

public class Ciencias {
	
	public static final String ENTIDAD="CIENCIAS";
	public static final String COD_SALON="COD_SALON";
	public static final String FECHA="FECHA";
	public static final String NOTAS="NOTAS";
	
	private ArrayList<Curso_nota> cursos = new ArrayList<Curso_nota>();
	private ArrayList<Key> claves = new ArrayList<Key>();
	
	private Entity ciencias = new Entity(ENTIDAD);
	
	public Ciencias(Key cod_salon, Date Fecha, ArrayList<Key> notas){
		ciencias.setProperty(COD_SALON, cod_salon);
		ciencias.setProperty(FECHA, Fecha);
		ciencias.setProperty(NOTAS, notas);
	}
	public Ciencias(){
		setCursos();
		ciencias.setProperty(COD_SALON, null);
		ciencias.setProperty(FECHA, null);
		ciencias.setProperty(NOTAS, claves);
	}
	
	public void setCursos(){
		for(int i=0;i<5;i++){ 
			cursos.add(new Curso_nota());
			claves.add(cursos.get(i).getEntity().getKey());
		}
	}
	public ArrayList<Curso_nota> getCursos(){
		return cursos;
	}	
	public Entity getEntity(){
		return ciencias;
	}
}