package com.zensar.spring.dao;

import java.util.List;

import com.zensar.entities.Product;


/*
 * Author: Pickle Rick
 * Creation Date: 25th July 2019 05.55 PM
 * Modified Date: 30th July 2019 15.10 
 * Version: 1.0
 * Copyright: Zensar Technologies. All rights reserved.
 * Description: Represents data access object interface.
 *    
 * */
public interface ProductDao {

	void insert(Product product);
	void update(Product product);
	void delete(Product product);
	Product getById(int productId);
	List<Product> getAll();
}
