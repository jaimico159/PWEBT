package estructura;

import com.google.appengine.api.datastore.Entity;

public class Director extends Persona {
	public static final String ENTIDAD = "DIRECTORES";
	public static final String COD_DIRECTOR = "COD_DIRECTOR"; 
	
	
	private Entity director;
	
	public Director(String nombres, String ap_paterno,String ap_materno,int dni,Correos correo,String cod_director){
		super(nombres,ap_paterno,ap_materno,dni,correo);
		director = new Entity(ENTIDAD,persona.getKey());
		director.setProperty(COD_DIRECTOR, cod_director);
	}
	
	public String getCodigo_Profesor(){
		return (String)director.getProperty(COD_DIRECTOR);
	}	
}
