package br.com.tomcat.servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TomcatServlet
 */
@WebServlet("/tomcatServlet")
//path http://localhost:8080/tomcat-project/tomcatServlet
public class TomcatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	org.apache.catalina.util.LifecycleBase logger;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TomcatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Welcome to the new world!");
				
		response.getWriter().append("Welcome to the new world, ").append(request.getParameter("name"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Nome: " + request.getParameter("name"));
		System.out.println("E-mail: " + request.getParameter("email"));
		System.out.println("E-mail: " + request.getParameter("email"));
		
		doGet(request, response);
	}

}
