package com.xworkz.webapplication;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/details")
public class SomeDetails extends HttpServlet {

	public SomeDetails() {
		System.out.println("SomeDetails no-args constructor...");
	}
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Running init method...");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("Running doget method...");
		
		String VagitableName = req.getParameter("VagitableName");
		double Vagitableprice =Double.parseDouble(req.getParameter("VagitablePrice")) ;
		String VagitableColor = req.getParameter("VagitableColor");
		
		String MovieName = req.getParameter("MovieName");
		String MovieHeroName = req.getParameter("MovieHeroName");
		String MovieHeroineName = req.getParameter("MovieHeroineName");
		LocalDate MovieReleaseDate = LocalDate.parse(req.getParameter("MovieReleaseDate")) ;
		int MovieTicketPrice =Integer.parseInt(req.getParameter("MovieTicketPrice"));
		double MovieBudget = Double.parseDouble(req.getParameter("MovieBudget"));
		
		String AirplaneName = req.getParameter("AirplaneName");
		String AirplaneColor = req.getParameter("AirplaneColor");
		String AirplaneTypes = req.getParameter("AirplaneTypes");
		String AirplaneParts = req.getParameter("AirplaneParts");
		int AirplaneSpeed =Integer.parseInt(req.getParameter("AirplaneSpeed"));

		String BookLibraryName = req.getParameter("BookLibraryName");
		String BookLibraryLocation = req.getParameter("BookLibraryLocation");
		String BookName = req.getParameter("BookName");
		String BookAutherName = req.getParameter("BookAutherName");
		String BookPublisher = req.getParameter("BookPublisher");
		Double BookPrice =Double.parseDouble(req.getParameter("BookPrice"));
		
		System.out.println("VagitableName :"+VagitableName+"\n"+"Vagitableprice"+Vagitableprice+"\n"+"VagitableColor"+VagitableColor);
		
		System.out.println("MovieName :"+MovieName+"\n"+"MovieHeroName :"+MovieHeroName
				+"MovieHeroineName :"+MovieHeroineName+"MovieReleaseDate :"+MovieReleaseDate+"MovieTicketPrice :"+MovieTicketPrice+"\n"
				+"MovieBudget :"+MovieBudget);
		
		System.out.println("AirplaneName :"+AirplaneName+"\n"+"AirplaneColor :"+AirplaneColor
				+"AirplaneTypes :"+AirplaneTypes+"AirplaneParts :"+AirplaneParts+"AirplaneSpeed :"+AirplaneSpeed);
		
		System.out.println("BookName :"+BookName+"\n"+"BookAutherName :"+BookAutherName
						+"BookPublisher :"+BookPublisher+"BookPrice :"+BookPrice+"BookLibraryName :"+BookLibraryName+"\n"
						+"BookLibraryLocation :"+BookLibraryLocation);
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<head>");
		writer.print("<body>");
		writer.print("<span style='background-color:Green'>");
		writer.print("<h1  style='color:white'>");
		writer.print(MovieName + "web series is regesterd successfully...........");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</head>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
	}
}
