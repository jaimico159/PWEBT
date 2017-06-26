package estructura;

import com.google.appengine.api.datastore.Entity;

public class Notas {
	
	public static final String NOTAS = "NOTAS";
	public static final String B1 = "B1";
	public static final String B2 = "B2";
	public static final String B3 = "B3";
	public static final String B4 = "B4";
	
	private Entity notas = new Entity(NOTAS);
	
	public Notas (Bimestre b1, Bimestre b2, Bimestre b3, Bimestre b4){
		notas.setProperty(B1, b1);
		notas.setProperty(B2, b2);
		notas.setProperty(B3, b3);
		notas.setProperty(B4, b4);
	}
	
	public Notas() {
		// TODO Auto-generated constructor stub
	}

	public Bimestre getB1() {
		return (Bimestre) notas.getProperty(B1);
	}
	public Bimestre getB2() {
		return (Bimestre) notas.getProperty(B2);
	}
	public Bimestre getB3() {
		return (Bimestre) notas.getProperty(B3);
	}
	public Bimestre getB4() {
		return (Bimestre) notas.getProperty(B4);
	}
	public Entity getEntity(){
		return notas;
	}
	
	
}
