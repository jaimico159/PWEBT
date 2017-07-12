package utilidades;

import estructura.DSF;
import estructura.Notas;
import estructura.Alumno;
import estructura.Correos;
import estructura.DSF;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.appengine.api.datastore.*;
import com.google.appengine.api.datastore.Query.*;

public class AlumnoUtilidades {
	public static void add(String nombres, String ap_paterno,String ap_materno,int dni,String correo,String tipo,boolean condicion,Key salon){
		Alumno x = new Alumno(nombres,ap_paterno,ap_materno,dni,correo,tipo,condicion,salon);
		DatastoreService data = DSF.getDatastoreService();
		List<Entity> lista4 = new ArrayList<Entity>();
		List<Entity> lista5 = new ArrayList<Entity>();
		List<Entity> lista6 = new ArrayList<Entity>();
		List<Entity> lista7 = new ArrayList<Entity>();
		List<Entity> m1= new ArrayList<Entity>();
		
		
		
		for(int i=0;i<5;i++){
			lista7.add(x.getNotas().getB1().getL1().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB1().getL2().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB1().getL3().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB1().getL4().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB2().getL1().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB2().getL2().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB2().getL3().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB2().getL4().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB3().getL1().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB3().getL2().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB3().getL3().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB3().getL4().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB4().getL1().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB4().getL2().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB4().getL3().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB4().getL4().getCursos().get(i).getEntity());
			
			lista7.add(x.getNotas().getB1().getC1().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB1().getC2().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB1().getC3().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB1().getC4().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB2().getC1().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB2().getC2().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB2().getC3().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB2().getC4().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB3().getC1().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB3().getC2().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB3().getC3().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB3().getC4().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB4().getC1().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB4().getC2().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB4().getC3().getCursos().get(i).getEntity());
			lista7.add(x.getNotas().getB4().getC4().getCursos().get(i).getEntity());
		}
		data.put(lista7);
		
		
		
		lista6.add(x.getNotas().getB1().getL1().getEntity());
		lista6.add(x.getNotas().getB1().getL2().getEntity());
		lista6.add(x.getNotas().getB1().getL3().getEntity());
		lista6.add(x.getNotas().getB1().getL4().getEntity());
		lista6.add(x.getNotas().getB2().getL1().getEntity());
		lista6.add(x.getNotas().getB2().getL2().getEntity());
		lista6.add(x.getNotas().getB2().getL3().getEntity());
		lista6.add(x.getNotas().getB2().getL4().getEntity());
		lista6.add(x.getNotas().getB3().getL1().getEntity());
		lista6.add(x.getNotas().getB3().getL2().getEntity());
		lista6.add(x.getNotas().getB3().getL3().getEntity());
		lista6.add(x.getNotas().getB3().getL4().getEntity());
		lista6.add(x.getNotas().getB4().getL1().getEntity());
		lista6.add(x.getNotas().getB4().getL2().getEntity());
		lista6.add(x.getNotas().getB4().getL3().getEntity());
		lista6.add(x.getNotas().getB4().getL4().getEntity());
		//lista5
		lista5.add(x.getNotas().getB1().getC1().getEntity());
		lista5.add(x.getNotas().getB1().getC2().getEntity());
		lista5.add(x.getNotas().getB1().getC3().getEntity());
		lista5.add(x.getNotas().getB1().getC4().getEntity());
		lista5.add(x.getNotas().getB2().getC1().getEntity());
		lista5.add(x.getNotas().getB2().getC2().getEntity());
		lista5.add(x.getNotas().getB2().getC3().getEntity());
		lista5.add(x.getNotas().getB2().getC4().getEntity());
		lista5.add(x.getNotas().getB3().getC1().getEntity());
		lista5.add(x.getNotas().getB3().getC2().getEntity());
		lista5.add(x.getNotas().getB3().getC3().getEntity());
		lista5.add(x.getNotas().getB3().getC4().getEntity());
		lista5.add(x.getNotas().getB4().getC1().getEntity());
		lista5.add(x.getNotas().getB4().getC2().getEntity());
		lista5.add(x.getNotas().getB4().getC3().getEntity());
		lista5.add(x.getNotas().getB4().getC4().getEntity());
		data.put(lista6);
		data.put(lista5);
		
		
		
		lista4.add(x.getNotas().getB1().getEntity());
		lista4.add(x.getNotas().getB2().getEntity());
		lista4.add(x.getNotas().getB3().getEntity());
		lista4.add(x.getNotas().getB4().getEntity());
		data.put(lista4);
	
		data.put(x.getCorreo().getEntity());
		data.put(x.getEntity());
		data.put(x.getNotas().getEntity());
		
		data.put(x.getEntity1());
		
		
		
		
		
		
		
		
	}
}
