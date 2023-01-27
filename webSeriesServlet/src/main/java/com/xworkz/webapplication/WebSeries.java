package com.xworkz.webapplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/series")
public class WebSeries extends HttpServlet {

	public WebSeries() {
		System.out.println("WebSeries no-args constructor..");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running init method,,,,,,");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doget method..");
		String name = req.getParameter("SeriesName");
		String language = req.getParameter("Language");
		int episode = Integer.parseInt(req.getParameter("NoOfEpisodes"));
		int budget = Integer.parseInt(req.getParameter("budget"));
		String ottPlatform = req.getParameter("ottPlatform");

		System.out.println("webSeriesName : " + name + "\n" + "Language :" + "\n" + "ottPlatform :" + "\n"
				+ "nOFEpisodes :" + episode + "\n" + "budget :" + budget);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<head>");
		writer.print("<body>");
		writer.print("<span style='background-color:Green'>");
		writer.print("<h1  style='color:white'>");
		writer.print(name + "web series is regesterd successfully...........");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</head>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
		
		
	}
}
