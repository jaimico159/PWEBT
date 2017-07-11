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
	public static void Add(String nombres, String ap_paterno,String ap_materno,int dni,String correo,String tipo,boolean condicion,Key salon){
		Correos y = new Correos(correo,tipo,condicion);
		Notas w = new Notas();
		Alumno x = new Alumno(nombres,ap_paterno,ap_materno,dni,correo,tipo,condicion,salon);
		DatastoreService data = DSF.getDatastoreService();
		ArrayList<Entity> m = new ArrayList<Entity>();
		m.add(x.getNotas().getEntity());
		m.add(x.getNotas().getB1().getEntity());
		m.add(x.getNotas().getB2().getEntity());
		m.add(x.getNotas().getB3().getEntity());
		m.add(x.getNotas().getB4().getEntity());
		m.add(x.getNotas().getB1().getC1().getEntity());
		m.add(x.getNotas().getB1().getC2().getEntity());
		m.add(x.getNotas().getB1().getC3().getEntity());
		m.add(x.getNotas().getB1().getC4().getEntity());
		m.add(x.getNotas().getB2().getC1().getEntity());
		m.add(x.getNotas().getB2().getC2().getEntity());
		m.add(x.getNotas().getB2().getC3().getEntity());
		m.add(x.getNotas().getB2().getC4().getEntity());
		m.add(x.getNotas().getB3().getC1().getEntity());
		m.add(x.getNotas().getB3().getC2().getEntity());
		m.add(x.getNotas().getB3().getC3().getEntity());
		m.add(x.getNotas().getB3().getC4().getEntity());
		m.add(x.getNotas().getB4().getC1().getEntity());
		m.add(x.getNotas().getB4().getC2().getEntity());
		m.add(x.getNotas().getB4().getC3().getEntity());
		m.add(x.getNotas().getB4().getC4().getEntity());
		
		m.add(x.getNotas().getB1().getL1().getEntity());
		m.add(x.getNotas().getB1().getL2().getEntity());
		m.add(x.getNotas().getB1().getL3().getEntity());
		m.add(x.getNotas().getB1().getL4().getEntity());
		m.add(x.getNotas().getB2().getL1().getEntity());
		m.add(x.getNotas().getB2().getL2().getEntity());
		m.add(x.getNotas().getB2().getL3().getEntity());
		m.add(x.getNotas().getB2().getL4().getEntity());
		m.add(x.getNotas().getB3().getL1().getEntity());
		m.add(x.getNotas().getB3().getL2().getEntity());
		m.add(x.getNotas().getB3().getL3().getEntity());
		m.add(x.getNotas().getB3().getL4().getEntity());
		m.add(x.getNotas().getB4().getL1().getEntity());
		m.add(x.getNotas().getB4().getL2().getEntity());
		m.add(x.getNotas().getB4().getL3().getEntity());
		m.add(x.getNotas().getB4().getL4().getEntity());
		
		for(int i=0;i<5;i++){
			m.add(x.getNotas().getB1().getL1().getCursos().get(i).getEntity());
			m.add(x.getNotas().getB1().getL2().getCursos().get(i).getEntity());
			m.add(x.getNotas().getB1().getL3().getCursos().get(i).getEntity());
			m.add(x.getNotas().getB1().getL4().getCursos().get(i).getEntity());
			m.add(x.getNotas().getB2().getL1().getCursos().get(i).getEntity());
			m.add(x.getNotas().getB2().getL2().getCursos().get(i).getEntity());
			m.add(x.getNotas().getB2().getL3().getCursos().get(i).getEntity());
			m.add(x.getNotas().getB2().getL4().getCursos().get(i).getEntity());
			m.add(x.getNotas().getB3().getL1().getCursos().get(i).getEntity());
			m.add(x.getNotas().getB3().getL2().getCursos().get(i).getEntity());
			m.add(x.getNotas().getB3().getL3().getCursos().get(i).getEntity());
			m.add(x.getNotas().getB3().getL4().getCursos().get(i).getEntity());
			m.add(x.getNotas().getB4().getL1().getCursos().get(i).getEntity());
			m.add(x.getNotas().getB4().getL2().getCursos().get(i).getEntity());
			m.add(x.getNotas().getB4().getL3().getCursos().get(i).getEntity());
			m.add(x.getNotas().getB4().getL4().getCursos().get(i).getEntity());
		
		}
		data.put(m);
		

	}
	
}