package estructura;

import com.google.appengine.api.datastore.Entity;

public class Secretario extends Persona {

	public static final String ENTIDAD = "SECRETARIOS";
	public static final String COD_SECRETARIO = "COD_SECRETARIO"; 
	public static final String PERSONA = "PERSONA";
	
	
	private Entity secretario = new Entity(ENTIDAD);
	
	public Secretario(String nombres, String ap_paterno,String ap_materno,int dni,Correos correo,String cod_secretario){
		super(nombres,ap_paterno,ap_materno,dni,correo);
		secretario.setProperty(COD_SECRETARIO, cod_secretario);
		secretario.setProperty(PERSONA, super.getEntity());
	}

	public String getNombres(){
		return (String)((Entity)secretario.getProperty(PERSONA)).getProperty(NOMBRES);
	}
	public String getAp_paterno(){
		return (String)((Entity)secretario.getProperty(PERSONA)).getProperty(AP_PATERNO);
	}
	public String getAp_materno(){
		return (String)((Entity)secretario.getProperty(PERSONA)).getProperty(AP_MATERNO);
	}
	public int getDni(){
		return (int)((Entity)secretario.getProperty(PERSONA)).getProperty(DNI);
	}
	public String getCorreo(){
		return (String)((Entity)((Entity)secretario.getProperty(PERSONA)).getProperty(CORREO)).getProperty("correo");
	}
	public String getCodigo_Profesor(){
		return (String)secretario.getProperty(COD_SECRETARIO);
	}

	
}
