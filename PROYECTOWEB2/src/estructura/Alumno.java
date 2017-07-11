package estructura;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;

public class Alumno extends Persona {
	
	public static final String ENTIDAD = "ALUMNOS";
	public static final String SALON = "SALON";
	public static final String NOTAS="NOTAS";
	
	private Notas notas;
	private Entity alumno;
	private Salones salon;
	
	
	public Alumno (String nombres, String ap_paterno,String ap_materno,int dni,Correos correo,
					String cod_al, Notas notas,Key salon){
		super(nombres,ap_paterno,ap_materno,dni,correo);
		alumno=new Entity(ENTIDAD,super.getEntity().getKey());
		alumno.setProperty(SALON, salon);
		alumno.setProperty(NOTAS, notas.getEntity().getKey());
	}
	public Alumno(String nombres, String ap_paterno,String ap_materno,int dni,String correo,String tipo,boolean condicion,
			Key salon){
		super(nombres,ap_paterno,ap_materno,dni,correo,tipo,condicion);
		notas=new Notas();
		alumno=new Entity(ENTIDAD,super.getEntity().getKey());
		alumno.setProperty(SALON, salon);
		alumno.setProperty(NOTAS, notas.getEntity().getKey());
	}
		
	public Notas getNotas() {
		return notas;
	}
	public Entity getEntity1(){
		return alumno;
	}		
}