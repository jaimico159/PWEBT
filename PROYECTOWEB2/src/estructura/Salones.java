package estructura;

import com.google.appengine.api.datastore.Entity;

public class Salones {
	public static final String ENTIDAD = "SALONES";
	public static final String GRADO = "GRADO";
	public static final String SECCION = "SECCION";
	
	Entity salon = new Entity(ENTIDAD);
	public Salones(int grado, String seccion){
		salon.setProperty(GRADO, grado);
		salon.setProperty(SECCION, seccion);
	}
	public Salones(){
		salon.setProperty(GRADO, 0);
		salon.setProperty(SECCION, null);
	}
	
	public String getSeccion(){
		return (String)salon.getProperty(SECCION);
	}
	public int getGrado(){
		return (int)salon.getProperty(GRADO);
	}
	public Entity getEntity(){
		return salon;
	}
}
