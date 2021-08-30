package com.filter;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FilterIP
 */
@WebServlet(urlPatterns="/FilterIP",
			initParams = {@WebInitParam(name = "google IP", value = "8.8.8.8")}
			)
public class FilterIP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String ip=request.getRemoteAddr();
    	String forbiddenIP=getServletConfig().getInitParameter("google IP");
    	
    	if(ip.equals(forbiddenIP)) {
    		response.sendRedirect("forbidden.jsp");
    	}else {
    		response.sendRedirect("success.jsp");
    	}
    }

}
