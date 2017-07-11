package estructura;

import com.google.appengine.api.datastore.Entity;

public class Curso {
	
	public static final String ENTIDAD="CURSOS";
	public static final String COD_CURSO="COD_CURSO";
	public static final String COD_PROFESOR="COD_PROFESOR";
	public static final String NOMBRE="NOMBRE";
	
	private Entity curso = new Entity(ENTIDAD);

	public Curso(String cod_profesor, String nombre){
		curso.setProperty(COD_PROFESOR, cod_profesor);
		curso.setProperty(NOMBRE, nombre);
	}
	
	public String getCod_curso() {
		return (String)curso.getProperty(COD_CURSO);
	}
	public String getNombre() {
		return (String) curso.getProperty(NOMBRE);
	}
	public String getCod_profesor(){
		return (String) curso.getProperty(COD_PROFESOR);
	}
	public Entity getEntity(){
		return curso;
	}
	
}