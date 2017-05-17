package estructura;

import java.util.ArrayList;

public class Ciencias {
	private int cod_grado;
	private ArrayList<Curso_nota> cursos = new ArrayList<Curso_nota>();
	public Ciencias(int grado){
		cod_grado=grado;
	}
	
	public void setCursos(){
		if(cod_grado==1 | cod_grado==2 |cod_grado==3)
			for(int i=0;i<9;i++)
				cursos.add(new Curso_nota());
		else
			for(int i=0;i<11;i++)
				cursos.add(new Curso_nota());
	}
	
	
	
}
