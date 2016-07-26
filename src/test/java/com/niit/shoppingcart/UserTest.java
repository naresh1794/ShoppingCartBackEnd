package com.niit.shoppingcart;



	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.DAO.UserDAO;
import com.niit.shoppingcart.model.User;


	public class UserTest {
		
		public static void main(String[] args) {
			
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			
			context.scan("com.niit.shoppingcart");
			context.refresh();
			
			UserDAO UserDAO = (UserDAO) context.getBean("userDAO");
			
			
			User user = (User) context.getBean("user");
			user.setId("USR123");
			user.setName("USRName123");
			user.setPassword("USRPsd123");
			user.setMobile("USRMbl123");
			user.setMail("USRMil123");
			user.setAddress("USRAdd123");
			 
			UserDAO.saveOrUpdate(user); 
			
		
			
		}
	}




