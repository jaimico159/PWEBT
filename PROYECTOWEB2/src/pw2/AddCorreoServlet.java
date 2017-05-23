package pw2;

import utilidades.CorreoUtilidades;
import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class AddCorreoServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");	
		CorreoUtilidades.agregar((String)req.getAttribute("correo"),(String) req.getAttribute("tipo"),(boolean)req.getAttribute("condicion"));
		resp.getWriter().println("<!DOCTYPE html>"	 
									+ "<html>"
									+ "<head><title>Información de la cuenta</title>"
									+ "<meta charset=utf-8;>"
									+ "<body>"
									+ "<h1>Información de la Cuenta Google</h1>"
									+ "<br><a href='../'>Regresar...</a>"
									+"<br/><b>User :</b>"
									+"<br/>Email: "+req.getAttribute("correo")
									+"<br/>Tipo: "+req.getAttribute("correo")
									+"<br/>Condicion: "+req.getAttribute("correo")
									+"<br/>"
									+"<br/><a href='/adminoptions'> Opciones de administrador</a>"
									+ "</body></html>");
	}
}
