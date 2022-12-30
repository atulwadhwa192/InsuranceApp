package com.data.InsuranceApp.controller;

import java.util.List;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.data.InsuranceApp.DAO.DaoImplementation;
import com.data.InsuranceApp.DAO.DaoInterface;
import com.data.InsuranceApp.InsuranceForm.InsuranceForm;

@Controller
public class HomeController {
	@Autowired
	DaoInterface dao;
//	DaoInterface dao = new DaoImplementation();
	@Autowired
	InsuranceForm iForm;
	
	public void buildSQLconnection(String url, String name, String password ) {
		dao.loadDriver();
		dao.setSQLConnection(url,name,password);		
		
	}

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("TypeUser");
	}
	
	@RequestMapping(value = "/loginPage")
	public String getLoginPage() {
		return "login";
	}
	@RequestMapping(value = "/UserLogin")
	public String getUserLogin() {
		return "Userhome";
	}
	@RequestMapping(value = "/AdminLogin")
	public String getAdminLogin() {
		return "Adminhome";
	}
	@RequestMapping(value = "/ApprovalPageUser")
	public String ValidateUser(HttpServletRequest request,HttpServletResponse response ) {
		
		String page_url = null;
		// dao obj
		String username =request.getParameter("email");
		String password = request.getParameter("password");
		buildSQLconnection("jdbc:mysql://127.0.0.1:3306/", "root","Sapiens@123");
		if(dao.validateStudent(username, password)) {
			page_url="login";
			
		}
		else {
			page_url="Userhome";
		}
		// where
		
		
		return page_url;
	}
	@RequestMapping(value = "/ApprovalPageAdmin")
	public String ValidateAdmin(HttpServletRequest request,HttpServletResponse response ) {
//		String page_url = null;
		// dao obj
		String username =request.getParameter("email");
		String password = request.getParameter("password");
		buildSQLconnection("jdbc:mysql://127.0.0.1:3306/", "root","Sapiens@123");
		if(dao.validateAdmin(username, password)) {
			return ("redirect:/getTableData");
		}
		else {
			return "Adminhome";
		}
//		dao.closeConnection();
//		return page_url;
				
		// where
		
	}
	@RequestMapping(value = "/getTableData")
	public ModelAndView getData() {
		String page_url = null;
		buildSQLconnection("jdbc:mysql://127.0.0.1:3306/", "root","Sapiens@123");
		List<InsuranceForm> list = dao.getData();
		
		ModelAndView mv= new ModelAndView();
		mv.setViewName("Policy_Table");
		mv.addObject("list",list);
		return mv;
	}
	
	@RequestMapping(value = "/submitForm",method = RequestMethod.POST)
	public String submitForm(HttpServletRequest request,HttpServletResponse response) {
		String page_url = null;
		// dao obj
		iForm.setFirstName(request.getParameter("fname"));
		iForm.setLastName(request.getParameter("lname"));
		iForm.setDob(Date.valueOf(request.getParameter("userdob")));
		iForm.setEmailId(request.getParameter("email"));
		iForm.setMobileNo(request.getParameter("num"));
		iForm.setGender(request.getParameter("gender"));
		iForm.setTobacoo(request.getParameter("tobacco"));
		iForm.setLifeCoverAge(Integer.valueOf(request.getParameter("lifecoverage")));
		iForm.setLifeCoverAmount(Integer.valueOf(request.getParameter("lifecover")));
		iForm.setIncome(Integer.valueOf(request.getParameter("income")));
		iForm.setStatus("Pending");
		buildSQLconnection("jdbc:mysql://127.0.0.1:3306/", "root","Sapiens@123");
		
		int result = dao.addData(iForm);
		if(result>0) {
			page_url="TypeUser";
		}
		else {
			page_url="login";
			
		}
		dao.closeConnection();

	
	
		return page_url;
		
	}
}
