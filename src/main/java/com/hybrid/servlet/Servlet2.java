package com.hybrid.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/Hello2")
public class Servlet2 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Servlet2</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<nav>");
		out.println("<a href = \"http://localhost:8080/DeptList.jsp\">DeptList.jsp</a>");
		out.println("<a href = \"http://localhost:8080/Hello.html\">Hello.html</a>");
		out.println("<a href = \"http://localhost:8080/Hello.jsp\">Hello.jsp</a>");
		out.println("<a href = \"http://localhost:8080/chap03/directive.jsp\">directive.jsp</a>");
		out.println("</nav>");
		out.println("</body>");
		out.println("</html>");
	}
}
