package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao;
import dto.Mdetails;

@WebServlet("/fetchall")
public class Fetchall extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
	    Dao dao=new Dao();
	    List< Mdetails> list=dao.fetchAll();
	    req.setAttribute("data",list);
		RequestDispatcher dispatcher=req.getRequestDispatcher("fetchall.jsp");
		dispatcher.forward(req, resp);
	}
}
