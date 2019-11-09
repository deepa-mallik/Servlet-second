package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/Second")
public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String a = request.getParameter("t1");
		String b = request.getParameter("t2");
		
		if(a.equals("admin")&& b.equals("admin")) {
			response.sendRedirect("Success.html");
		}
		else {
			response.sendRedirect("Failure.html");
		}
	}

}
