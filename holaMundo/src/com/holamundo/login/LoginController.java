package com.holamundo.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.holamundo.login.beans.Login;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Login login = new Login();
		RequestDispatcher requestDispatcher = null; //Ayudara a generar respuestas
		
		login.setName(request.getParameter("name"));
		login.setPassword(request.getParameter("password"));
		
		if(login.autentication()){
			requestDispatcher = request.getRequestDispatcher("welcome.jsp");//Pagina a donde se redirecionara
		}else{
			requestDispatcher = request.getRequestDispatcher("error.jsp");
		}
		requestDispatcher.forward(request, response); //Manda la llamda que de difinio en el dispatcer
	}

}
