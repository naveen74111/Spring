package com.xworkz.sendDetails;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendDetailsServlet
 */
@WebServlet(loadOnStartup = 1,urlPatterns = "/send")
public class SendDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendDetailsServlet() {
        super();
        System.out.println("Created : SendDetailsServlet");
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Running doPost in SendDetailsServlet");
		
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String gender = request.getParameter("gender");
		String reason = request.getParameter("reason");
		String address = request.getParameter("address");
		
		System.out.println("FirstName :"+firstName);
		System.out.println("LastName :"+lastName);
		System.out.println("Gender : "+gender);
		System.out.println("Reason :"+reason);
		System.out.println("Address :"+address);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Display.jsp");
		request.setAttribute("FirstName",firstName);
		request.setAttribute("LastName", lastName);
		request.setAttribute("Gender", gender);
		request.setAttribute("reason", reason);
		request.setAttribute("Address", address);
		
		dispatcher.forward(request, response);
		
	}

}
