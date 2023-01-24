package com.xworkz.server;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/serve", loadOnStartup = 2)
public class Server extends HttpServlet {

	public Server() {
		System.out.println("Created Server no-args constructor");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {

		System.out.println("running init method");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Doget method in Server..");
	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("delete mrthod...");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Post from Server");
		String data = "Car Race!!!!!! , Bike Race!!!!!! , Cycle Race!!!!!!......";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	@Override
	protected void doHead(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Head from server");
		String data1 = "ROYAL-ENFIELD,PULSUR-150,PULSOR-NS200,PULSUR-220";
		PrintWriter writer = arg1.getWriter();
		writer.print(data1);
		arg1.setContentType("text/plain");
	}
	@Override
	protected void doOptions(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Options from server");
		String data2 = "RICE,RICEBATH,CURDRICE,PULIOGERE";
		PrintWriter writer = arg1.getWriter();
		writer.print(data2);
		arg1.setContentType("text/plain");
	}
	@Override
	protected void doTrace(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("Trace from server.");
		String data3 = "GPS...NAVIGATION...COMPASS";
		PrintWriter writer = arg1.getWriter();
		writer.print(data3);
		arg1.setContentType("text/plain");
	}
}
