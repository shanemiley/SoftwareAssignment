package com.example.service;

import java.util.List;

import com.example.business.User;
import com.example.dao.UserDao;
import com.example.exceptions.DaoException;

public class UserService {

	UserDao dao = new UserDao();
	
	//new code ---------------------------------------------------------------------------------------------------------
	
	public List<User> getAllUsers(){
		
		List<User> u = null;
		try {			
			u = dao.getAllUsers();
		} 
		catch (DaoException e) {
			e.printStackTrace();
		}
		return u;
		
	}
	
	
	//end new code ----------------------------------------------------------------------------------------------------------
	
	public User login(String username, String password){
		
		User u = null;
		try {			
			u = dao.findUserByUsernamePassword(username, password);
		} 
		catch (DaoException e) {
			e.printStackTrace();
		}
		return u;
		
	}
	
}