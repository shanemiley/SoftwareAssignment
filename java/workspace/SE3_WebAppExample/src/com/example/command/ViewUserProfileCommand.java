package com.example.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.business.User;

public class ViewUserProfileCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse repsonse){
			
	
		String forwardToJsp = "";		
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		
		if (user != null){
			System.out.println("error here");
		forwardToJsp = "/ViewMyProfile.jsp";
		System.out.println("error here 1");

		}else{
			
			System.out.println("null");
			forwardToJsp = "/errorPage.jsp";
		}
		
		return forwardToJsp;
	}

}