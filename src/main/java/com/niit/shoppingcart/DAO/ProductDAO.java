package com.niit.shoppingcart.DAO;

import java.util.List;

public interface ProductDAO {
	
	
	
	public List<com.niit.shoppingcart.model.Product> list();
	
	public  com.niit.shoppingcart.model.Product get(String id);
	
	
	
	public void delete(String id);

	

	public void saveOrUpdate(com.niit.shoppingcart.model.Product product);



}
