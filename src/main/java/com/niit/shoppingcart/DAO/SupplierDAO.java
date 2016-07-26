package com.niit.shoppingcart.DAO;

import java.util.List;

public interface SupplierDAO {
	
	
	
	public List<com.niit.shoppingcart.model.Supplier> list();
	
	public  com.niit.shoppingcart.model.Supplier get(String id);
	
	
	
	public void delete(String id);

	

	public void saveOrUpdate(com.niit.shoppingcart.model.Supplier category);



}



