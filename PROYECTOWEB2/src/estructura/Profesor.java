package estructura;

import com.google.appengine.api.datastore.Entity;

public class Profesor extends Persona {
	
	public static final String ENTIDAD = "PROFESORES";
	Entity profesor; 
	
	public Profesor(String nombres, String ap_paterno,String ap_materno,int dni,Correos correo,String cod_profesor){
		super(nombres,ap_paterno,ap_materno,dni,correo);
		profesor =  new Entity(ENTIDAD,super.getEntity().getKey());
	}
	
	public Entity getEntity1(){
		return profesor;
	}
}
