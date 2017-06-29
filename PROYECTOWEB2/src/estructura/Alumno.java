package estructura;

import com.google.appengine.api.datastore.Entity;

public class Alumno extends Persona {
	
	public static final String ENTIDAD = "ALUMNOS";
	public static final String CODIGO_AL = "COD_ALUMNO";
	public static final String NOTAS = "NOTAS";
	public static final String GRADO = "GRADO";
	public static final String PERSONA = "PERSONA";
	public static final String SECCION = "SECCION";
	
	private Entity alumno = new Entity(ENTIDAD);
	
	public Alumno (String nombres, String ap_paterno,String ap_materno,int dni,Correos correo,
					String cod_al, Notas notas, int grado, String seccion){
		super(nombres,ap_paterno,ap_materno,dni,correo);
		alumno.setProperty(CODIGO_AL, cod_al);
		alumno.setProperty(NOTAS, notas);
		alumno.setProperty(GRADO, grado);
		alumno.setProperty(SECCION, seccion);
		alumno.setProperty(PERSONA, super.getEntity());
	}
		
	public String getCod_alumno() {
		return (String) alumno.getProperty(CODIGO_AL);
	}
	public Notas getNotas() {
		return (Notas) alumno.getProperty(NOTAS);
	}
	public int getGrado() {
		return (int) alumno.getProperty(GRADO);
	}
	public String getSeccion(){
		return (String) alumno.getProperty(SECCION);
	}
	public Entity getAlumno(){
		return alumno;
	}
	
	
}
