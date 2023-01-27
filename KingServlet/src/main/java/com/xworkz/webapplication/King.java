package com.xworkz.webapplication;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/king")
public class King extends HttpServlet {

	public King() {

		System.out.println("King no args constructor...");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("Running init method....");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method....");
		String name = req.getParameter("KingName");
		String region = req.getParameter("Language");
		int noOfQueens = Integer.parseInt(req.getParameter("Language"));
		LocalDate dateOfBirth = LocalDate.parse(req.getParameter("date"));
		LocalDate dateOfDeath = LocalDate.parse(req.getParameter("date"));

		System.out.println("KingName:" + name + "\n" + "region :" + region + "\n" + "noOfQueens" + noOfQueens + "\n"
				+ "dateOfBirth" + dateOfBirth + "\n" + "dateOfDeath" + dateOfDeath);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<spam style='background-color:Green'>");
		writer.print(name + "King Details is regesterd successfully...........");
		writer.print("</spam>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");

	}
}
