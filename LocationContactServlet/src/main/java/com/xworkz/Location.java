package com.xworkz;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/location")
public class Location extends HttpServlet{
	public Location() {
		System.out.println("created location");
	}

//	@Override
//	public void init() throws ServletException {
//		System.out.println("running init of location");
//	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running the doget of location");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String start = req.getParameter("start");
		String destination = req.getParameter("destination");
		String gender = req.getParameter("gender");

		System.out.println(name);
		System.out.println(email);
		System.out.println(start);
		System.out.println(destination);
		System.out.println(gender);

		PrintWriter write = resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		if (name.length() > 3) {
			write.print("<span style='color:blue'>");
			write.print("contact Name is " + name);
		} else {
			write.print("<span style='color:green'>");
			write.print("contact Name is invalid ");
		}
		write.print("<br>");
		if (email.length() > 9) {
			write.print("<span style='color:yellow'>");
			write.print("email1 is " + email);
		} else {
			write.print("<span style='color:red'>");
			write.print("email1 is invalid ");
		}
		write.print("<br>");
		if (start.length() > 5) {
			write.print("<span style='color:blue'>");
			write.print("started in " + start);
		} else {
			write.print("<span style='color:violet'>");
			write.print("started in is invalid ");
		}

		write.print("<br>");
		if (destination.length() > 4) {
			write.print("<span style='color:black'>");
			write.print("destination is " + destination);
		} else {
			write.print("<span style='color:green'>");
			write.print("destination is invalid " + destination);
		}
		write.print("<br>");
		if (gender.length() > 3) {
			write.print("<span style='color:green'>");
			write.print("gender is " + gender);
		} else {
			write.print("<span style='color:red'>");
			write.print("gender is invalid" + gender);
		}
		
		write.print("<a href=\"Location.html\">Go back to Location details</a>");
		write.print("</h1>");
		write.print("</body>");
		write.print("</html>");
		resp.setContentType("text/html");
	}

}
