package estructura;

import com.google.appengine.api.datastore.Entity;

public class Persona {
	
	public static final String ENTIDAD = "PERSONA";
	public static final String NOMBRES = "NOMBRES";
	public static final String AP_PATERNO = "AP_PATERNO";
	public static final String AP_MATERNO = "AP_MATERNO";
	public static final String DNI = "DNI";
	public static final String CORREO = "CORREO";
	
	private Entity persona = new Entity(ENTIDAD);
	
	public Persona(String nombres, String ap_paterno,String ap_materno,int dni,Correos correo){
		persona.setProperty(NOMBRES, nombres);
		persona.setProperty(AP_PATERNO, ap_paterno);
		persona.setProperty(AP_PATERNO, ap_materno);
		persona.setProperty(DNI, dni);
		persona.setProperty(CORREO, correo.getEntity());
		
	}
	
	public Persona(String nombres, String ap_paterno,String ap_materno,int dni,Entity correo){
		persona.setProperty(NOMBRES, nombres);
		persona.setProperty(AP_PATERNO, ap_paterno);
		persona.setProperty(AP_PATERNO, ap_materno);
		persona.setProperty(DNI, dni);
		persona.setProperty(CORREO, correo);
		
	}
	
	
	public String getNombres() {
		return (String) persona.getProperty(NOMBRES);
	}

	public String getAp_paterno() {
		return (String) persona.getProperty(AP_PATERNO);
	}

	public String getAp_materno() {
		return (String) persona.getProperty(AP_MATERNO);
	}

	public int getDNI() {
		return (int) persona.getProperty(DNI);
	}

	public String getCorreo() {
		return (String) ((Entity) persona.getProperty(CORREO)).getProperty("correo");
	}

	public Entity getEntity(){
		return persona;
	}
	
}
