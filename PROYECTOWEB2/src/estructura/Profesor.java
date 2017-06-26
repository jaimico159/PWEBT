package estructura;

public class Profesor extends Persona {
	
	public Profesor(String nombres, String ap_paterno, String ap_materno, int dni, Correos correo) {
		super(nombres, ap_paterno, ap_materno, dni, correo);
		// TODO Auto-generated constructor stub
	}

	String cod_profesor;

	public Profesor() {
		//super();
		this.cod_profesor = null;
	}

	public String getCod_profesor() {
		return cod_profesor;
	}

	public void setCod_profesor(String cod_profesor) {
		this.cod_profesor = cod_profesor;
	}
	
	
	
	
}
