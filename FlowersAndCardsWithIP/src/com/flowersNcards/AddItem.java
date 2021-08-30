package com.flowersNcards;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AddItem
 */
@WebServlet("/AddItem")
public class AddItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		
		String flowerAmount=request.getParameter("flower");
		String cardAmount=request.getParameter("card");

		if(flowerAmount!=null) {
			Integer fa=(Integer) session.getAttribute("flowerAmount");			
			if(fa==null) {
				fa=Integer.parseInt(flowerAmount);
				session.setAttribute("flowerAmount", fa);
			}else {
				fa+=Integer.parseInt(flowerAmount);
				session.setAttribute("flowerAmount", fa);				
			}
		}
		
		if(cardAmount!=null) {
			Integer ca=(Integer) session.getAttribute("cardAmount");			
			if(ca==null) {
				ca=Integer.parseInt(cardAmount);
				session.setAttribute("cardAmount", ca);
			}else {
				ca+=Integer.parseInt(cardAmount);
				session.setAttribute("cardAmount", ca);				
			}
		}
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}
