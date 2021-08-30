package com.verify;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VerifyUnP
 */
@WebServlet(name = "VerifyUnP",
			urlPatterns = {"/VerifyUnP"},
        	initParams={@WebInitParam(name="username", value="rk"),
        				@WebInitParam(name="password", value="ravikant")}
		)
public class VerifyUnP extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static boolean checkTwoString(String s1,String s2) {
		return s1.equals(s2);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		String configUsername=getServletConfig().getInitParameter("username");
		String configPassword=getServletConfig().getInitParameter("password");		
		
		if(checkTwoString(username, configUsername) && checkTwoString(password, configPassword)) {
			out.write("------- WELCOME -------");
		}else {
			Integer X=Integer.parseInt(getServletContext().getInitParameter("X"));
			for(int i=0; i<X; i++)
				out.write("username: "+username + "   " +"password: "+password+"<br />");
		}
	}

}
