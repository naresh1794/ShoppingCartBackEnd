package com.niit.shoppingcart.DAO;

import java.util.List;
import java.util.Locale.Category;

public interface CategoryDAO {
	
	
	
	public List<com.niit.shoppingcart.model.Category> list();
	
	public  com.niit.shoppingcart.model.Category get(String id);
	
	
	
	public void delete(String id);

	

	public void saveOrUpdate(com.niit.shoppingcart.model.Category category);



}
