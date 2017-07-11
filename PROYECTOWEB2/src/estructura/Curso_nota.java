package estructura;

import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.Key;

public class Curso_nota {
	
	public static final String ENTIDAD="CURSO_NOTA";
	public static final String COD_CURSO="COD_CURSO";
	public static final String VALOR_NOTA="VALOR_NOTA";
	
	private Entity curso_nota = new Entity(ENTIDAD);
	
	public Curso_nota(Key curso,int valor_nota){
		curso_nota.setProperty(COD_CURSO, curso);
		curso_nota.setProperty(VALOR_NOTA, valor_nota);
	}
	public Curso_nota(){
		curso_nota.setProperty(COD_CURSO, null);
		curso_nota.setProperty(VALOR_NOTA, 0);
	}
	public String getCod_curso() {
		return (String)curso_nota.getProperty(COD_CURSO);
	}
	public int getValor_nota() {
		return (int) curso_nota.getProperty(VALOR_NOTA);
	}
	public Entity getEntity(){
		return curso_nota;
	}
}
