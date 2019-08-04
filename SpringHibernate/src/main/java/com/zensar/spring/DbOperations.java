package com.zensar.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.spring.services.ProductService;
import com.zensar.spring.services.ProductServiceImpl;

/**
 * Hello world!
 *
 */
public class DbOperations 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("dbConfig.xml");
        
        Product product = new Product(1001,"Pixel2","Google",70500);
        Product product2 = new Product();
//        product2.setProductId(1007);
//        product2.setName("Pixel3XL");
//        product2.setBrand("Google");
//        product2.setPrice(70700);
        
        ProductService pService = ctx.getBean("productServiceImpl",ProductService.class);
        
        pService.create(product);
//        pService.create(product2);
        
        product = pService.findbyProductId(1007);
        System.out.println(product);
        
//        product2 = new Product(1005,"Pixel","Google",65000);
//        pService.edit(product2);
        
//        product2.setProductId(1007);
//        pService.remove(product2);
//        
        
        List<Product> pList = pService.findAllProducts();
        
        for (Product product3 : pList) {
			System.out.println(product3);
		}
        
        
    }
}
