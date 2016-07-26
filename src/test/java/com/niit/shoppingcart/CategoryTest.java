package com.niit.shoppingcart;



	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	import com.niit.shoppingcart.DAO.CategoryDAO;
	import com.niit.shoppingcart.model.Category;

	public class CategoryTest {
		
		public static void main(String[] args) {
			
			AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
			
			context.scan("com.niit.shoppingcart");
			context.refresh();
			
			CategoryDAO CategoryDAO = (CategoryDAO) context.getBean("categoryDAO");
			
			
			Category Category = (Category) context.getBean("category");
			Category.setId("CG123");
			Category.setName("CGName123");
			Category.setDescription("CGDesc123");
			 
			CategoryDAO.saveOrUpdate(Category); 
			
		
			
		}
	}




