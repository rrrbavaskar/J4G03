 package org.learnjobs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ColorServlet extends HttpServlet {
	
	public void service(HttpServletRequest r1, HttpServletResponse r2) throws IOException {
		PrintWriter out =r2.getWriter();
		out.println("<h1>Welcome Students called from Welcome.html</h1>");
		

	}
}
