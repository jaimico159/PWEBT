package estructura;

import com.google.appengine.api.datastore.Entity;

public class Administrador extends Persona {
	public static final String ENTIDAD="ADMINISTRADORES";
	public static final String COD_ADMIN="COD_ADMIN";
	
	Entity admin ;
	public Administrador(String nombres, String ap_paterno,String ap_materno,int dni,Correos correo,String cod_admin){
		super(nombres,ap_paterno,ap_materno,dni,correo);
		admin = new Entity(ENTIDAD,super.getEntity().getKey());
		admin.setProperty(COD_ADMIN, cod_admin);
	}
	
	public String getCod_Admin(){
		return (String) admin.getProperty(COD_ADMIN);
	}
	
}
