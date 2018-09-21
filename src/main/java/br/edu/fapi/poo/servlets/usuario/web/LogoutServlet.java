package br.edu.fapi.poo.servlets.usuario.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {		
//		Redirecionamento do lado do servidor.
//		O cliente n�o sabe o que est� acontecendo.
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("/WEB-INF/pages/logout/logout.jsp");
		requestDispatcher.forward(req, resp);
	}

}
