package com.emailRedirecting;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmailRedirect
 */
@WebServlet("/EmailRedirect")
public class EmailRedirect extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String mail=request.getParameter("mail");
		
		if(mail.equals("Gmail")) {
			response.sendRedirect("https://www.google.com/intl/en_in/gmail/about/");
		}else if(mail.equals("Rediff")) {
			response.sendRedirect("https://www.rediff.com/");
		}else if(mail.equals("Yahoo")) {
			response.sendRedirect("https://en.wikipedia.org/wiki/Yahoo!_Mail");
		}else if(mail.equals("HotMail")) {
			response.sendRedirect("https://outlook.live.com/owa/");
		}else {
			response.sendRedirect("unknown.jsp");			
		}
		
	}

}
