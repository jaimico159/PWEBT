package estructura;

import com.google.appengine.api.datastore.Entity;

public class Profesor extends Persona {
	
	public static final String ENTIDAD = "PROFESORES";
	public static final String COD_PROFESOR = "COD_PROFESOR"; 
	public static final String PERSONA = "PERSONA";
	
	
	private Entity profesor = new Entity(ENTIDAD);
	
	public Profesor(String nombres, String ap_paterno,String ap_materno,int dni,Correos correo,String cod_profesor){
		super(nombres,ap_paterno,ap_materno,dni,correo);
		profesor.setProperty(COD_PROFESOR, cod_profesor);
		profesor.setProperty(PERSONA, super.getEntity());
	}
	
	public String getNombres(){
		return (String)((Entity)profesor.getProperty(PERSONA)).getProperty(NOMBRES);
	}
	public String getAp_paterno(){
		return (String)((Entity)profesor.getProperty(PERSONA)).getProperty(AP_PATERNO);
	}
	public String getAp_materno(){
		return (String)((Entity)profesor.getProperty(PERSONA)).getProperty(AP_MATERNO);
	}
	public int getDni(){
		return (int)((Entity)profesor.getProperty(PERSONA)).getProperty(DNI);
	}
	public String getCorreo(){
		return (String)((Entity)((Entity)profesor.getProperty(PERSONA)).getProperty(CORREO)).getProperty("correo");
	}
	public String getCodigo_Profesor(){
		return (String)profesor.getProperty(COD_PROFESOR);
	}
	
	
}
