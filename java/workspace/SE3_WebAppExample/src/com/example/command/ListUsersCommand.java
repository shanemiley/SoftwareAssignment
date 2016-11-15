package com.example.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.business.User;
import com.example.service.UserService;

public class ListUsersCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse repsonse){
			
		UserService userService = new UserService();
		String forwardToJsp = "";		
		
		List<User> users = userService.getAllUsers();
		
		if (users != null){
			System.out.println("here");

			//If login successful, store the session id for this client...
			HttpSession session = request.getSession();
			session.setAttribute("userList", users);
		
		forwardToJsp = "/listUser.jsp";
		}else{
			System.out.println("null");
			forwardToJsp = "/errorPage.jsp";
		}
		

		return forwardToJsp;
	}

}