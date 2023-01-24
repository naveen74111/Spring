package com.xworkz.tetra.target;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/call")
public class FirstWebServlet extends HttpServlet {

	
	public FirstWebServlet() {
		System.out.println("Created FirstWebServlet..."+this.getClass().getSimpleName());
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Created Doget...FirstWebServlet...");
	}
}
