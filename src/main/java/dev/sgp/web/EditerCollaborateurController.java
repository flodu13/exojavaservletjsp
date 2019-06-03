package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {
		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws
		ServletException, IOException {
	
			
	String matriculeParam = req.getParameter("matricule");
			
			resp.setContentType("text/html");
			
			if (matriculeParam==null) {
				System.out.println("Un matricule est attendu");
				resp.sendError(400, "le matricule est attendu");
			} else {
				resp.setStatus(200);
				resp.getWriter().write("<h1>Edition de collaborateur</h1>"
						+ "<p>Matricule : " + matriculeParam + "</p>");
			}

		}
}
