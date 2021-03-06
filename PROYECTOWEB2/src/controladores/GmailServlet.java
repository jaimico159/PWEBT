package controladores;

import utilidades.CorreoUtilidades;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.*;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

import estructura.Correos;

@SuppressWarnings("serial")
public class GmailServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException, ServletException {
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();

		UserService us = UserServiceFactory.getUserService();
		User user = us.getCurrentUser();
		Correos elegido;
		List<Correos> lista = CorreoUtilidades.getEntries();
		//out.println(lista.size());
		if(user==null){
			resp.sendRedirect(us.createLoginURL("/Login.jsp"));
		}
		else{
			System.out.println(user.getEmail());
			if(user.getEmail().equals("jaimehuarsayarivera@gmail.com") | user.getEmail().equals("jaime.huarsaya.rivera@gmail.com")){
				System.out.println("te voy a redirigir");
				req.getRequestDispatcher("WEB-INF/jsp_inicios/adminoptions.jsp").forward(req, resp);
				System.out.println("debe redirigir");
			}else
			if(lista.isEmpty()){
				System.out.println("lista vacia causa");
				resp.sendRedirect("Pagina.html");
			}
			else{
			if(CorreoUtilidades.buscarCorreo(lista,user.getEmail())!=null){
					elegido=CorreoUtilidades.buscarCorreo(lista,user.getEmail());
					if(elegido.getTipo().equals("administrador")){	
						if(elegido.getCondicion()){
							req.getRequestDispatcher("/WEB-INF/jsp_inicios/adminoptions.jsp").forward(req, resp);
						}
						else{
							out.println("Su cuenta es de administrador pero est� inactiva contactese con "
									+ "el administrador principal");
						}		 
					}
					else if(elegido.getTipo().equals("estudiante")){
						if(elegido.getCondicion()){
							req.getRequestDispatcher("/WEB-INF/jsp_inicios/aluoptions.jsp").forward(req, resp);
						}
						else{
							out.println("Su cuenta es de estudiante pero est� inactiva contactese con el administrador principal");
						}
					}
					
					
					else if(elegido.getTipo().equals("profesor")){
						if(elegido.getCondicion()){
							req.getRequestDispatcher("/WEB-INF/jsp_inicios/profeoptions.jsp").forward(req, resp);
						}
						else{
							out.println("Su cuenta es de Profesor pero est� inactiva cont�ctese con el admin principal");
						}
					}
					
					
					else if(elegido.getTipo().equals("director")){
						if(elegido.getCondicion()){
							out.println("<!DOCTYPE html>"	 
									+ "<html>"
									+ "<head><title>Informaci�n de la cuenta</title>"
									+ "<meta charset=utf-8;>"
									+ "<body>"
									+ "<h1>Informaci�n de la Cuenta Google</h1>"
									+ "<br><a href='../'>Regresar...</a>"
									+"<br/><b>User :</b>"
									+"<br/>getNickname retorn� : "+user.getNickname()
									+"<br/>getEmail retorn� : "+user.getEmail()
									+"<br/><img src='imagenes/reina.jpg'> "
									+"<br/>"
									+"<a href='"+ us.createLogoutURL("http://1-dot-profar-167808.appspot.com")+"'> Cerrar sesi�n </a>"
									+ "</body></html>");
							req.getRequestDispatcher("/WEB-INF/jsp_inicios/directoroptions.jsp").forward(req, resp);
							
						}
						else{
							out.println("Su cuenta es de Director pero est� inactiva cont�ctese con el admin principal");
						}
					}
					
					
					else if(elegido.getTipo().equals("secretario")){
						if(elegido.getCondicion()){
							out.println("<!DOCTYPE html>"	 
									+ "<html>"
									+ "<head><title>Informaci�n de la cuenta</title>"
									+ "<meta charset=utf-8;>"
									+ "<body>"
									+ "<h1>Informaci�n de la Cuenta Google</h1>"
									+ "<br><a href='../'>Regresar...</a>"
									+"<br/><b>User :</b>"
									+"<br/>getNickname retorn� : "+user.getNickname()
									+"<br/>getEmail retorn� : "+user.getEmail()
									+"<br/><img src='imagenes/alfil.jpg'> "
									+"<br/>"
									+"<a href='"+ us.createLogoutURL("http://1-dot-profar-167808.appspot.com")+"'> Cerrar sesi�n </a>"
									+ "</body></html>");
							req.getRequestDispatcher("/WEB-INF/jsp_inicios/secreoptions.jsp").forward(req, resp);
							
						}
						else{
							out.println("Su cuenta es de Secretario pero est� inactiva cont�ctese con el admin principal");
						}
					}
				}
				else{
					resp.sendRedirect("Pagina.html");
				}
			}
		}
		
	}
}