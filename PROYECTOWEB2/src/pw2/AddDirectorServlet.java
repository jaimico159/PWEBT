package pw2;

import utilidades.AdminUtilidades;
import utilidades.CorreoUtilidades;
import utilidades.DirectorUtilidades;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@SuppressWarnings("serial")
public class AddDirectorServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String nombres=req.getParameter("correo"),ap_paterno=req.getParameter("ap_paterno")
				,ap_materno=req.getParameter("ap_materno"),correo = req.getParameter("correo"),tipo=req.getParameter("tipo");
		Key clave = KeyFactory.stringToKey(req.getParameter("clave"));
		int dni=Integer.parseInt(req.getParameter("dni"));
		boolean condicion=Boolean.parseBoolean(req.getParameter("condicion"));
		DirectorUtilidades.add(nombres,ap_paterno,ap_materno,dni,correo,tipo,condicion);
		resp.setContentType("text/html");
		resp.getWriter().print("HA SIDO AGREGADO SATISFACTORIAMENTE");
		req.getRequestDispatcher("/WEB-INF/jsp_inicios/adminoptions.jsp").forward(req, resp);
		}
}
