package com.xworkz.SignUpForm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/sign")
public class Contact extends HttpServlet {

	public Contact() {

		System.out.println("Created : SignForm");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init method...");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running in doPost...");

		String name = req.getParameter("name");
		String email = req.getParameter("email");
		Long mobile = Long.parseLong(req.getParameter("mobile"));
		String comments = req.getParameter("comments");
		
		System.out.println("Name : "+name);
		System.out.println("email : "+email);
		System.out.println("mobile : "+mobile);
		System.out.println("comments : "+comments);
		
		PrintWriter writer= resp.getWriter();
		writer.print("<html>");
		writer.print("<head>");
		writer.print("<body>");
		writer.print("<h1>");
		if(name.length()>3) {
			writer.print("<span style='color:green'>");
			writer.print("Sign In Sucessfully" + name);
		}else
		{
			writer.print("<span style='color:red'>");
			writer.print("name should be greater than 3 characters" + name);
		}
		
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</head>");
		writer.print("</body>");
		writer.print("</html>");	
		
	}
}
