package pw2;

import utilidades.CorreoUtilidades;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ModificarCorreoServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String correo=req.getParameter("correo"),tipo=req.getParameter("tipo"),co = req.getParameter("co");
		String condicion=req.getParameter("condicion");
		
		
		CorreoUtilidades.ModificarCorreo(co, correo, tipo, condicion);
		
		resp.setContentType("text/html");	
		
		resp.getWriter().println("<!DOCTYPE html>"	 
									+ "<html>"
									+ "<head><title>Informaci�n de la cuenta</title>"
									+ "<meta charset=utf-8;>"
									+ "<body>"
									+ "<h1>Informaci�n de la Cuenta Google</h1>"
									+ "<br><a href='../'>Regresar...</a>"
									+"<br/><b>User :</b>"
									+"<br/>Email: "+correo
									+"<br/>Tipo: "+tipo
									+"<br/>Condicion: "+condicion
									+"<br/>"
									+"<br/>"
									+"<form role='form' action='/choseOption' method='post'>"
									+"<div class='form-group'>"
									+"<input type='hidden' value='adminoptions' name='opcion'>"
									+"</div>"
									+"<button type='submit' class='btn btn-default'>Opciones de Admin</button>"
								+"</form>"
									+"<br/>"

									+ "</body></html>");
	}
}
