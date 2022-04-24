package org.learnjobs;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
		public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		int n1 = Integer.parseInt(req.getParameter("start"));
		int n2 = Integer.parseInt(req.getParameter("end"));
		int sum = n1 + n2;
		res.getWriter().println("<h2>Sum of the 2 numbers is "+sum+"</h2>");
		
	}

}
