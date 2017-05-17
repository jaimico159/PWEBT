package estructura;

public class Notas {
	private Bimestre B1,B2,B3,B4;

	public Notas(Bimestre b1, Bimestre b2, Bimestre b3, Bimestre b4) {
		super();
		B1 = b1;
		B2 = b2;
		B3 = b3;
		B4 = b4;
	}

	public Bimestre getB1() {
		return B1;
	}

	public void setB1(Bimestre b1) {
		B1 = b1;
	}

	public Bimestre getB2() {
		return B2;
	}

	public void setB2(Bimestre b2) {
		B2 = b2;
	}

	public Bimestre getB3() {
		return B3;
	}

	public void setB3(Bimestre b3) {
		B3 = b3;
	}

	public Bimestre getB4() {
		return B4;
	}

	public void setB4(Bimestre b4) {
		B4 = b4;
	}
	
}
