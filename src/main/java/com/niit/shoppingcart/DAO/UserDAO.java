package com.niit.shoppingcart.DAO;

import java.util.List;

public interface UserDAO {
	
	
	
	public List<com.niit.shoppingcart.model.User> list();
	
	public  com.niit.shoppingcart.model.User get(String id);
	
	
	
	public void delete(String id);

	

	public void saveOrUpdate(com.niit.shoppingcart.model.User user);



}
