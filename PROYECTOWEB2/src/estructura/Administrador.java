package estructura;

import com.google.appengine.api.datastore.Entity;

public class Administrador extends Persona {
	public static final String ENTIDAD="ADMINISTRADORES";
	
	Entity admin;
	public Administrador(String nombres, String ap_paterno,String ap_materno,int dni,String correo,String tipo, boolean condicion){
		super(nombres,ap_paterno,ap_materno,dni,correo,tipo,condicion);
		admin = new Entity(ENTIDAD,super.getEntity().getKey());
	}
	
	public Entity getEntity1(){
		return admin;
	}
}
