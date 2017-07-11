package estructura;

import com.google.appengine.api.datastore.Entity;

public class Director extends Persona {
	public static final String ENTIDAD = "DIRECTORES";
	private Entity director;
	
	public Director(String nombres, String ap_paterno,String ap_materno,int dni,Correos correo,String cod_director){
		super(nombres,ap_paterno,ap_materno,dni,correo);
		director = new Entity(ENTIDAD,persona.getKey());
	}
	public Entity getEntity1(){
		return director;
	}
}
