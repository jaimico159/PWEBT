package estructura;

import com.google.appengine.api.datastore.Entity;

public class Profesor extends Persona {
	
	public static final String ENTIDAD = "PROFESORES";
	public static final String COD_PROFESOR = "COD_PROFESOR"; 
	
	
	Entity profesor; 
	
	public Profesor(String nombres, String ap_paterno,String ap_materno,int dni,Correos correo,String cod_profesor){
		super(nombres,ap_paterno,ap_materno,dni,correo);
		profesor =  new Entity(ENTIDAD,super.getEntity().getKey());
		profesor.setProperty(COD_PROFESOR, cod_profesor);
	}
	
	public String getCodigo_Profesor(){
		return (String)profesor.getProperty(COD_PROFESOR);
	}
}
