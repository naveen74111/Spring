package com.xworkz.SignUpForm;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/loc")
public class Location extends HttpServlet {

	public Location() {
		System.out.println("Created : SignupForm");
	}

	@Override
	public void init() throws ServletException {

		System.out.println("Running init method..");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Running doget method......");

		String userName = req.getParameter("userName");
		String userEmail = req.getParameter("userEmail");
		String startPoint = req.getParameter("startPoint");
		String destinationPoint = req.getParameter("destinationPoint");
		String gender = req.getParameter("status");

		System.out.println("userName : " + userName);
		System.out.println("userEmail : " + userEmail);
		System.out.println("startPoint : " + startPoint);
		System.out.println("destinationPoint : " + destinationPoint);
		System.out.println("gender : " + gender);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<head>");
		writer.print("<body>");
		writer.print("<h1>");

		if (userName.length() > 3) {
			writer.print("<span style='color:green'>");
			writer.print("Sign In Successfully..." + userName);
		} else {
			writer.print("<span style='color:red'>");
			writer.print("userName should be greater then 3 characters" + userName);
		}
		writer.print("</span>");
		writer.print("</head>");
		writer.print("</body>");
		writer.print("<html>");
                resp.setContentType("text/html");
	}
	}
}
