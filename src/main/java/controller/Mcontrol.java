package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Dao;
import dto.Mdetails;
@WebServlet("/msd")
public class Mcontrol extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String S3=arg0.getParameter("fullname");
		String S4=arg0.getParameter("dateofbirth");
		String S5=arg0.getParameter("email");
		String S6=arg0.getParameter("mobilenumber");
		String S7=arg0.getParameter("gender");
		String S8=arg0.getParameter("fathername");
		String S9=arg0.getParameter("placeofbirth");
		String S10=arg0.getParameter("nationality");
		String S11=arg0.getParameter("bloodgroup");
		String S12=arg0.getParameter("passportnumber");
		String S13=arg0.getParameter("aadharnumber");
		String S14=arg0.getParameter("pancardnumber");
		String S15=arg0.getParameter("housename");
		String S16=arg0.getParameter("street");
		String S17=arg0.getParameter("area");
		String S18=arg0.getParameter("city");
		String S19=arg0.getParameter("state");
		String S20=arg0.getParameter("pincode");
		String S21=arg0.getParameter("qualification1");
		String S22=arg0.getParameter("percentage1");
		//String S23=req.getParameter("marksheet1");
		String S24=arg0.getParameter("qualification2");
		String S25=arg0.getParameter("percentage2");
		//String S26=req.getParameter("marksheet2");
		
		
		Mdetails c1=new Mdetails();
		c1.setFullname(S3);
		c1.setDateofbirth(S4);
		c1.setEmail(S5);
		c1.setMobilenumber(S6);
		c1.setGender(S7);
		c1.setFathername(S8);
		c1.setPlaceofbirth(S9);
		c1.setNationality(S10);
		c1.setBloodgroup(S11);
		c1.setPassportnumber(S12);
		c1.setAadharnumber(S13);
		c1.setPancardnumber(S14);
		c1.setHousename(S15);
		c1.setStreet(S16);
		c1.setArea(S17);
		c1.setCity(S18);
		c1.setState(S19);
		c1.setPincode(S20);
		c1.setQualification1(S21);
		c1.setPercentage1(S22);
		//c1.setMarksheet1(S23);
		c1.setQualification2(S24);
		c1.setPercentage2(S25);
		//c1.setMarksheet2(S26);
		
		Dao D1=new Dao();
		D1.create(c1);
		
		RequestDispatcher dispatcher=arg0.getRequestDispatcher("decision.html");
		dispatcher.forward(arg0, arg1);
	}
}
