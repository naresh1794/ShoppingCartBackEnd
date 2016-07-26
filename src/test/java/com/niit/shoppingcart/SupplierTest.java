package com.niit.shoppingcart;



	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	import com.niit.shoppingcart.DAO.SupplierDAO;
	import com.niit.shoppingcart.model.Supplier;

	public class SupplierTest {
		
		public static void main(String[] args) {
			
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			
			context.scan("com.niit.shoppingcart");
			context.refresh();
			
			SupplierDAO SupplierDAO = (SupplierDAO) context.getBean("supplierDAO");
			
			
			Supplier Supplier = (Supplier) context.getBean("supplier");
			Supplier.setId("sup123");
			Supplier.setName("CG\\supName123");
			Supplier.setAddress("sapadd123");
			 
			SupplierDAO.saveOrUpdate(Supplier); 
			
		
			
		}
	}




