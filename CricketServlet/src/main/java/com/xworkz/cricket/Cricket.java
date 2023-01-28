package com.xworkz.cricket;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/love")
public class Cricket extends HttpServlet{
	
	public Cricket() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	@Override
	public void init() throws ServletException {
		System.out.println("Running Init..........");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running DoGet..........");
		String gameName = req.getParameter("gameName");
		String startedCountry = req.getParameter("startedCountry");
		String kingOfCricket = req.getParameter("kingOfCricket");
		String godOfCricket = req.getParameter("godOfCricket");
		String donOfCricket = req.getParameter("donOfCricket");
		String countryOfKing = req.getParameter("countryOfKing");
		String countryOfGod = req.getParameter("countryOfGod");
		String countryOfDon = req.getParameter("countryOfDon");
		String no1ODITeam = req.getParameter("no1ODITeam");
		String no1T20Team = req.getParameter("no1T20Team");
		String no1TestTeam = req.getParameter("no1TestTeam");
		String mostRunsBy = req.getParameter("mostRunsBy");
		String mostWicketsBy = req.getParameter("mostWicketsBy");
		String mostCenturiesBy = req.getParameter("mostCenturiesBy");
		String noOfCenturies = req.getParameter("noOfCenturies");
		String batsmanOfDecade = req.getParameter("batsmanOfDecade");
		String bowlerOfDecade = req.getParameter("bowlerOfDecade");
		String mostWicketsInInnings = req.getParameter("mostWicketsInInnings");
		String mostRunsInInnings = req.getParameter("mostRunsInInnings");
		String bestAllrounder = req.getParameter("bestAllrounder");
		String GOAT = req.getParameter("GOAT");
		
		
		System.out.println(gameName);
		System.out.println(startedCountry);
		System.out.println(kingOfCricket);
		System.out.println(godOfCricket);
		System.out.println(donOfCricket);
		System.out.println(countryOfKing);
		System.out.println(countryOfGod);
		System.out.println(countryOfDon);
		System.out.println(no1ODITeam);
		System.out.println(no1T20Team);
		System.out.println(no1TestTeam);
		System.out.println(mostRunsBy);
		System.out.println(mostWicketsBy);
		System.out.println(mostCenturiesBy);
		System.out.println(noOfCenturies);
		System.out.println(batsmanOfDecade);
		System.out.println(bowlerOfDecade);
		System.out.println(mostWicketsInInnings);
		System.out.println(mostRunsInInnings);
		System.out.println(bestAllrounder);
		System.out.println(GOAT);
		
		
		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		writer.print("<span style='color:blue;'>");
		writer.print("king Name " + gameName + " is sent succes");
		writer.print("</span>");
		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");
		resp.setContentType("text/html");
		
		
	}

}
