package myapp;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WdbServlet;

//@WebServlet(urlPatterns = "/FightingKorea")
public class Fightingkorea extends HttpServlets {
	
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response)
	throws IOException, ServletException {
		response.setContentType("text/html;charset=euc-kr");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("<title>MyServlet</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>������ �ڸ���!!!</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}

