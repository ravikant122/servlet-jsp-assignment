package com.readProductCatalog;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadingProductCatalog
 */
@WebServlet(urlPatterns= {"/ReadingProductCatalog"},
			initParams = {@WebInitParam(name="filePath",value="C:\\Users\\ve00ym258\\Documents\\Servlet Jsp lab assignment\\Product Catalog Using Servlet\\textFile.txt")})
public class ReadingProductCatalog extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		String filePath = this.getServletConfig().getInitParameter("filePath");
		String input;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			while ((input = reader.readLine()) != null) {
				out.write(input + "<br />");
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
