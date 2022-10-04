package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class indexServerlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		String pagina = "/index.jsp";
		try {
			RequestDispatcher dispatecher = getServletContext().getRequestDispatcher(pagina); 
			dispatecher.forward(req, resp);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
