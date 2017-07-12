package estructura;

import com.google.appengine.api.datastore.Entity;

public class Administrador extends Persona {
	public static final String ENTIDAD="ADMINISTRADORES";
	
	Entity admin;
	public Administrador(String nombres, String ap_paterno,String ap_materno,int dni,Correos correo,String cod_admin){
		super(nombres,ap_paterno,ap_materno,dni,correo);
		admin = new Entity(ENTIDAD,super.getEntity().getKey());
	}
	
	public Entity getEntity1(){
		return admin;
	}
}
