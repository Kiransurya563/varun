package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.Ldetails;
@WebServlet("/abd")
public class Lcontrol extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		
		Ldetails ldetails=new Ldetails();
		ldetails.setUsername(username);
		ldetails.setPassword(password);
		
		Dao dao=new Dao();
		dao.lDetails(ldetails);
		RequestDispatcher dispatcher=req.getRequestDispatcher("main.html");
		dispatcher.forward(req, resp);
	}

}
