package com.xworkz.tetra.target;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 7, urlPatterns = "/eagle")
public class EdgeBrowser extends HttpServlet {

	public EdgeBrowser() {
		System.out.println("EdgeBrowser..........");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doget method in EdgeBrowser....");
	}
}
