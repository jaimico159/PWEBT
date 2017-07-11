package estructura;

import com.google.appengine.api.datastore.Entity;

public class Notas {
	
	public static final String ENTIDAD="NOTAS";
	public static final String B1 = "B1";
	public static final String B2 = "B2";
	public static final String B3 = "B3";
	public static final String B4 = "B4";
	
	private Bimestre Bim1,Bim2,Bim3,Bim4;
	private Entity notas = new Entity(ENTIDAD);
	
	public Notas (Bimestre b1, Bimestre b2, Bimestre b3, Bimestre b4){
		
		notas.setProperty(B1, b1.getEntity().getKey());
		notas.setProperty(B2, b2.getEntity().getKey());
		notas.setProperty(B3, b3.getEntity().getKey());
		notas.setProperty(B4, b4.getEntity().getKey());
	}
	
	public Notas() {
		Bim1=new Bimestre();
		Bim2=new Bimestre();
		Bim3=new Bimestre();
		Bim4=new Bimestre();
		notas.setProperty(B1, Bim1.getEntity().getKey());
		notas.setProperty(B2, Bim2.getEntity().getKey());
		notas.setProperty(B3, Bim3.getEntity().getKey());
		notas.setProperty(B4, Bim4.getEntity().getKey());
	}

	public Bimestre getB1() {
		return Bim1;
	}
	public Bimestre getB2() {
		return Bim2;
	}
	public Bimestre getB3() {
		return Bim3;
	}
	public Bimestre getB4() {
		return Bim4;
	}
	public Entity getEntity(){
		return notas;
	}
	
	
}
