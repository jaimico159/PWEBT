package estructura;

import com.google.appengine.api.datastore.Entity;

public class Bimestre {
	public static final String ENTIDAD="BIMESTRE";
	public static final String C1="C1";
	public static final String C2="C2";
	public static final String C3="C3";
	public static final String C4="C4";
	public static final String L1="L1";
	public static final String L2="L2";
	public static final String L3="L3";
	public static final String L4="L4";
	
	private Ciencias c1,c2,c3,c4;
	private Letras l1,l2,l3,l4;
	
	private Entity bimestre = new Entity(ENTIDAD);
	
	public Bimestre(Ciencias c1,Ciencias c2,Ciencias c3,Ciencias c4,Letras l1, Letras l2, Letras l3, Letras l4){
		bimestre.setProperty(C1,c1.getEntity().getKey());
		bimestre.setProperty(C2,c2.getEntity().getKey());
		bimestre.setProperty(C3,c3.getEntity().getKey());
		bimestre.setProperty(C4,c4.getEntity().getKey());
		bimestre.setProperty(L1,l1.getEntity().getKey());
		bimestre.setProperty(L2,l2.getEntity().getKey());
		bimestre.setProperty(L3,l3.getEntity().getKey());
		bimestre.setProperty(L4,l4.getEntity().getKey());
	}
	public Bimestre(){
		c1=new Ciencias();
		c2=new Ciencias();
		c3=new Ciencias();
		c4=new Ciencias();
		l1=new Letras();
		l2=new Letras();
		l3=new Letras();
		l4=new Letras();
		bimestre.setProperty(C1,c1.getEntity().getKey());
		bimestre.setProperty(C2,c2.getEntity().getKey());
		bimestre.setProperty(C3,c3.getEntity().getKey());
		bimestre.setProperty(C4,c4.getEntity().getKey());
		bimestre.setProperty(L1,l1.getEntity().getKey());
		bimestre.setProperty(L2,l2.getEntity().getKey());
		bimestre.setProperty(L3,l3.getEntity().getKey());
		bimestre.setProperty(L4,l4.getEntity().getKey());
		
	}
		
	
	
	public Ciencias getC1() {
		return c1;
	}
	public Ciencias getC2() {
		return c2;
	}
	public Ciencias getC3() {
		return c3;
	}
	public Ciencias getC4() {
		return c4;
	}
	public Letras getL1() {
		return l1;
	}
	public Letras getL2() {
		return l2;
	}
	public Letras getL3() {
		return l3;
	}
	public Letras getL4() {
		return l4;
	}
	public Entity getEntity(){
		return bimestre;
	}
	
	
	
}	
