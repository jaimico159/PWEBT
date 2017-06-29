package estructura;

import com.google.appengine.api.datastore.Entity;

public class Director extends Persona {
	public static final String ENTIDAD = "DIRECTORES";
	public static final String COD_DIRECTOR = "COD_DIRECTOR"; 
	public static final String PERSONA = "PERSONA";
	
	
	private Entity director = new Entity(ENTIDAD);
	
	public Director(String nombres, String ap_paterno,String ap_materno,int dni,Correos correo,String cod_director){
		super(nombres,ap_paterno,ap_materno,dni,correo);
		director.setProperty(COD_DIRECTOR, cod_director);
		director.setProperty(PERSONA, super.getEntity());
	}
	
	public String getNombres(){
		return (String)((Entity)director.getProperty(PERSONA)).getProperty(NOMBRES);
	}
	public String getAp_paterno(){
		return (String)((Entity)director.getProperty(PERSONA)).getProperty(AP_PATERNO);
	}
	public String getAp_materno(){
		return (String)((Entity)director.getProperty(PERSONA)).getProperty(AP_MATERNO);
	}
	public int getDni(){
		return (int)((Entity)director.getProperty(PERSONA)).getProperty(DNI);
	}
	public String getCorreo(){
		return (String)((Entity)((Entity)director.getProperty(PERSONA)).getProperty(CORREO)).getProperty("correo");
	}
	public String getCodigo_Profesor(){
		return (String)director.getProperty(COD_DIRECTOR);
	}

	
	
	
}
