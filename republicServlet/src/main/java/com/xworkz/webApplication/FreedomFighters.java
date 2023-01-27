package com.xworkz.webApplication;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/fighter")
public class FreedomFighters extends HttpServlet {

	public FreedomFighters() {
		System.out.println("running FreedomFighters");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {

  System.out.println("running init method");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doGet method..");
		String name = req.getParameter("FighterName");
		String alive = req.getParameter("alive");
		String mode = req.getParameter("mode");
		String weapon = req.getParameter("weapon");

		System.out.println(name);
		System.out.println(alive);
		System.out.println(mode);
		System.out.println(weapon);

		PrintWriter writer = resp.getWriter();
		writer.print(name + "web series is regesterd successfully...........");
		resp.setContentType("text/plain");
		
	}

}
