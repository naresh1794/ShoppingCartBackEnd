package com.niit.shoppingcart;



	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	import com.niit.shoppingcart.DAO.ProductDAO;
	import com.niit.shoppingcart.model.Product;

	public class ProductTest {
		
		public static void main(String[] args) {
			
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			
			context.scan("com.niit.shoppingcart");
			context.refresh();
			
			ProductDAO ProductDAO = (ProductDAO) context.getBean("productDAO");
			
			
			Product Product = (Product) context.getBean("product");
			Product.setId("PRD123");
			Product.setName("PRDName123");
			Product.setDescription("PRDDesc123");
			Product.setPrice("PRDPice123");
			 
			ProductDAO.saveOrUpdate(Product); 
			
		
			
		}
	}




