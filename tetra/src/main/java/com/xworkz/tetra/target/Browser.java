package com.xworkz.tetra.target;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 4, urlPatterns = "/browser")
public class Browser extends HttpServlet {

	public Browser() {
		System.out.println("hhhhhhhhhhhhhhhhhhhhhh");
		System.out.println("Breowser........");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet...For...Browser...");
	}
	
	
}
