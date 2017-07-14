package utilidades;

import estructura.DSF;
import estructura.Letras;
import estructura.Notas;
import estructura.Alumno;
import estructura.Bimestre;
import estructura.Ciencias;
import estructura.Correos;
import estructura.DSF;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.appengine.api.datastore.*;
import com.google.appengine.api.datastore.Query.*;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

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
	
	public static Entity seek(String correo){
		DatastoreService a = DSF.getDatastoreService();
		UserService us = UserServiceFactory.getUserService();
		User user = us.getCurrentUser();
		Filter f = new FilterPredicate(Correos.CORREO,FilterOperator.EQUAL,user.getEmail());
		Query q = new Query().setFilter(f);
		Entity e = a.prepare(q).asSingleEntity();
		Filter f1 = new FilterPredicate(Alumno.CORREO,FilterOperator.EQUAL,e.getKey());
		Query q1 = new Query().setFilter(f1);
		Entity x = a.prepare(q1).asSingleEntity();
		return x;
	}
	
	@SuppressWarnings("unchecked")
	public static void getNotas(Entity alumno) throws EntityNotFoundException{
		DatastoreService a = DSF.getDatastoreService();
		//notas
		Entity notas = a.get((Key) alumno.getProperty(Alumno.NOTAS));
		//bimestres
		Entity b1,b2,b3,b4;
		//examenes de ciencias
		Entity b1c1,b1c2,b1c3,b1c4;
		Entity b2c1,b2c2,b2c3,b2c4;
		Entity b3c1,b3c2,b3c3,b3c4;
		Entity b4c1,b4c2,b4c3,b4c4;
		//examenes de letras
		Entity b1l1,b1l2,b1l3,b1l4;
		Entity b2l1,b2l2,b2l3,b2l4;
		Entity b3l1,b3l2,b3l3,b3l4;
		Entity b4l1,b4l2,b4l3,b4l4;
		//cursos de los examenes de ciencias
		ArrayList<Entity> cb1c1,cb1c2,cb1c3,cb1c4;
		ArrayList<Entity> cb2c1,cb2c2,cb2c3,cb2c4;
		ArrayList<Entity> cb3c1,cb3c2,cb3c3,cb3c4;
		ArrayList<Entity> cb4c1,cb4c2,cb4c3,cb4c4;
		//cursos de los examenes de letras
		ArrayList<Entity> cb1l1,cb1l2,cb1l3,cb1l4;
		ArrayList<Entity> cb2l1,cb2l2,cb2l3,cb2l4;
		ArrayList<Entity> cb3l1,cb3l2,cb3l3,cb3l4;
		ArrayList<Entity> cb4l1,cb4l2,cb4l3,cb4l4;
		
		
		b1=a.get((Key)notas.getProperty(Notas.B1));
		b2=a.get((Key)notas.getProperty(Notas.B2));
		b3=a.get((Key)notas.getProperty(Notas.B3));
		b4=a.get((Key)notas.getProperty(Notas.B4));
		
		b1c1=a.get((Key) b1.getProperty(Bimestre.C1));
		b1c2=a.get((Key) b1.getProperty(Bimestre.C2));
		b1c3=a.get((Key) b1.getProperty(Bimestre.C3));
		b1c4=a.get((Key) b1.getProperty(Bimestre.C4));
		b1l1=a.get((Key) b1.getProperty(Bimestre.L1));
		b1l2=a.get((Key) b1.getProperty(Bimestre.L2));
		b1l3=a.get((Key) b1.getProperty(Bimestre.L3));
		b1l4=a.get((Key) b1.getProperty(Bimestre.L4));
		
		b2c1=a.get((Key) b2.getProperty(Bimestre.C1));
		b2c2=a.get((Key) b2.getProperty(Bimestre.C2));
		b2c3=a.get((Key) b2.getProperty(Bimestre.C3));
		b2c4=a.get((Key) b2.getProperty(Bimestre.C4));
		b2l1=a.get((Key) b2.getProperty(Bimestre.L1));
		b2l2=a.get((Key) b2.getProperty(Bimestre.L2));
		b2l3=a.get((Key) b2.getProperty(Bimestre.L3));
		b2l4=a.get((Key) b2.getProperty(Bimestre.L4));
		
		b3c1=a.get((Key) b3.getProperty(Bimestre.C1));
		b3c2=a.get((Key) b3.getProperty(Bimestre.C2));
		b3c3=a.get((Key) b3.getProperty(Bimestre.C3));
		b3c4=a.get((Key) b3.getProperty(Bimestre.C4));
		b3l1=a.get((Key) b3.getProperty(Bimestre.L1));
		b3l2=a.get((Key) b3.getProperty(Bimestre.L2));
		b3l3=a.get((Key) b3.getProperty(Bimestre.L3));
		b3l4=a.get((Key) b3.getProperty(Bimestre.L4));

		b4c1=a.get((Key) b4.getProperty(Bimestre.C1));
		b4c2=a.get((Key) b4.getProperty(Bimestre.C2));
		b4c3=a.get((Key) b4.getProperty(Bimestre.C3));
		b4c4=a.get((Key) b4.getProperty(Bimestre.C4));
		b4l1=a.get((Key) b4.getProperty(Bimestre.L1));
		b4l2=a.get((Key) b4.getProperty(Bimestre.L2));
		b4l3=a.get((Key) b4.getProperty(Bimestre.L3));
		b4l4=a.get((Key) b4.getProperty(Bimestre.L4));
		
		
		cb1c1=(ArrayList<Entity>) a.get((ArrayList<Key>)b1c1.getProperty(Ciencias.NOTAS));
		cb1c2=(ArrayList<Entity>) a.get((ArrayList<Key>)b1c2.getProperty(Ciencias.NOTAS));
		cb1c3=(ArrayList<Entity>) a.get((ArrayList<Key>)b1c3.getProperty(Ciencias.NOTAS));
		cb1c4=(ArrayList<Entity>) a.get((ArrayList<Key>)b1c4.getProperty(Ciencias.NOTAS));
		cb1l1=(ArrayList<Entity>) a.get((ArrayList<Key>)b1c1.getProperty(Letras.NOTAS));
		cb1l2=(ArrayList<Entity>) a.get((ArrayList<Key>)b1c2.getProperty(Letras.NOTAS));
		cb1l3=(ArrayList<Entity>) a.get((ArrayList<Key>)b1c3.getProperty(Letras.NOTAS));
		cb1l4=(ArrayList<Entity>) a.get((ArrayList<Key>)b1c4.getProperty(Letras.NOTAS));
		
		cb2c1=(ArrayList<Entity>) a.get((ArrayList<Key>)b2c1.getProperty(Ciencias.NOTAS));
		cb2c2=(ArrayList<Entity>) a.get((ArrayList<Key>)b2c2.getProperty(Ciencias.NOTAS));
		cb2c3=(ArrayList<Entity>) a.get((ArrayList<Key>)b2c3.getProperty(Ciencias.NOTAS));
		cb2c4=(ArrayList<Entity>) a.get((ArrayList<Key>)b2c4.getProperty(Ciencias.NOTAS));
		cb2l1=(ArrayList<Entity>) a.get((ArrayList<Key>)b2c1.getProperty(Letras.NOTAS));
		cb2l2=(ArrayList<Entity>) a.get((ArrayList<Key>)b2c2.getProperty(Letras.NOTAS));
		cb2l3=(ArrayList<Entity>) a.get((ArrayList<Key>)b2c3.getProperty(Letras.NOTAS));
		cb2l4=(ArrayList<Entity>) a.get((ArrayList<Key>)b2c4.getProperty(Letras.NOTAS));
		
		cb3c1=(ArrayList<Entity>) a.get((ArrayList<Key>)b3c1.getProperty(Ciencias.NOTAS));
		cb3c2=(ArrayList<Entity>) a.get((ArrayList<Key>)b3c2.getProperty(Ciencias.NOTAS));
		cb3c3=(ArrayList<Entity>) a.get((ArrayList<Key>)b3c3.getProperty(Ciencias.NOTAS));
		cb3c4=(ArrayList<Entity>) a.get((ArrayList<Key>)b3c4.getProperty(Ciencias.NOTAS));
		cb3l1=(ArrayList<Entity>) a.get((ArrayList<Key>)b3c1.getProperty(Letras.NOTAS));
		cb3l2=(ArrayList<Entity>) a.get((ArrayList<Key>)b3c2.getProperty(Letras.NOTAS));
		cb3l3=(ArrayList<Entity>) a.get((ArrayList<Key>)b3c3.getProperty(Letras.NOTAS));
		cb3l4=(ArrayList<Entity>) a.get((ArrayList<Key>)b3c4.getProperty(Letras.NOTAS));

		cb4c1=(ArrayList<Entity>) a.get((ArrayList<Key>)b4c1.getProperty(Ciencias.NOTAS));
		cb4c2=(ArrayList<Entity>) a.get((ArrayList<Key>)b4c2.getProperty(Ciencias.NOTAS));
		cb4c3=(ArrayList<Entity>) a.get((ArrayList<Key>)b4c3.getProperty(Ciencias.NOTAS));
		cb4c4=(ArrayList<Entity>) a.get((ArrayList<Key>)b4c4.getProperty(Ciencias.NOTAS));
		cb4l1=(ArrayList<Entity>) a.get((ArrayList<Key>)b4c1.getProperty(Letras.NOTAS));
		cb4l2=(ArrayList<Entity>) a.get((ArrayList<Key>)b4c2.getProperty(Letras.NOTAS));
		cb4l3=(ArrayList<Entity>) a.get((ArrayList<Key>)b4c3.getProperty(Letras.NOTAS));
		cb4l4=(ArrayList<Entity>) a.get((ArrayList<Key>)b4c4.getProperty(Letras.NOTAS));
		
	}
}
