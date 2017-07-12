package pw2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

import utilidades.SalonesUtilidades;

@SuppressWarnings("serial")
public class AddSalonServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String seccion=req.getParameter("seccion");
		int grado=Integer.parseInt(req.getParameter("grado"));
		SalonesUtilidades.add(grado,seccion);
		resp.setContentType("text/html");
		resp.getWriter().print("HA SIDO AGREGADO SATISFACTORIAMENTE");
		req.getRequestDispatcher("/WEB-INF/jsp_inicios/adminoptions.jsp").forward(req, resp);
		}
}
