package com.zensar.spring.services;

import java.util.List;



import com.zensar.entities.Product;

/*
* Author: Pickle Rick
* Creation Date: 25th July 2019 05.55 PM
* Modified Date: 30th July 2019 16.55 
* Version: 1.0
* Copyright: Zensar Technologies. All rights reserved.
* Description: Represents product services which can be accessed by
* presentation layer.
* It encapsulates business logic of product entity   
* 
* */
public interface ProductService {

	
	
	void create(Product product);
	void edit(Product product);
	void remove(Product product);
	
	Product findbyProductId(int productId);
	
	List<Product> findAllProducts();
	
	
}
