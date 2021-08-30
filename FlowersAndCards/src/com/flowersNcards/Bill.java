package com.flowersNcards;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Bill
 */
@WebServlet("/Bill")
public class Bill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession();
		
		Integer flowerAmount=(Integer) session.getAttribute("flowerAmount");
		Integer cardAmount=(Integer) session.getAttribute("cardAmount");
		
		if(flowerAmount!=null) {
			out.write("total flower amount = "+flowerAmount+"<br>");
		}else {
			out.write("total flower amount = 0"+"<br>");			
		}

		if(cardAmount!=null) {
			out.write("total card amount = "+cardAmount+"<br>");
		}else {
			out.write("total card amount = 0"+"<br>");			
		}

	}

}
