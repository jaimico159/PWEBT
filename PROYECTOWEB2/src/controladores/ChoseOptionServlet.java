package controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class ChoseOptionServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		resp.setContentType("text/html");
		String a =req.getParameter("opcion");
		if(a.equals("addAlumno"))
			req.getRequestDispatcher("WEB-INF/jsp_inicios/adminoptions.jsp").forward(req, resp);	
		else if(a.equals("addProfesor"))
			req.getRequestDispatcher("WEB-INF/jsp_inicios/adminoptions.jsp").forward(req, resp);
		else if(a.equals("addDirector"))
			req.getRequestDispatcher("WEB-INF/jsp_inicios/adminoptions.jsp").forward(req, resp);
		else if(a.equals("addSecretario"))
			req.getRequestDispatcher("WEB-INF/jsp_inicios/adminoptions.jsp").forward(req, resp);
		else if(a.equals("addAdmin"))
			req.getRequestDispatcher("WEB-INF/jsp_inicios/adminoptions.jsp").forward(req, resp);
		else if(a.equals("addSalon"))
			req.getRequestDispatcher("WEB-INF/jsp_inicios/adminoptions.jsp").forward(req, resp);
	}
}
