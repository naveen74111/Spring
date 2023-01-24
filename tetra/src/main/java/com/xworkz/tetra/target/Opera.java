package com.xworkz.tetra.target;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 5,urlPatterns = "/opera")
public class Opera extends HttpServlet {

	public Opera() {
		System.out.println("Opera......");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		System.out.println("doget...for...Opera..");
	}
	
}
