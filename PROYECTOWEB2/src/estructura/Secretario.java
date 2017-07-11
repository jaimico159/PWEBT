package estructura;

import com.google.appengine.api.datastore.Entity;

public class Secretario extends Persona {

	public static final String ENTIDAD = "SECRETARIOS";
	public static final String COD_SECRETARIO = "COD_SECRETARIO"; 

	private Entity secretario;
	
	public Secretario(String nombres, String ap_paterno,String ap_materno,int dni,Correos correo,String cod_secretario){
		super(nombres,ap_paterno,ap_materno,dni,correo);
		secretario = new Entity(ENTIDAD,persona.getKey());
		secretario.setProperty(COD_SECRETARIO, cod_secretario);
	}
	public String getCodigo_Secretario(){
		return (String)secretario.getProperty(COD_SECRETARIO);
	}
}