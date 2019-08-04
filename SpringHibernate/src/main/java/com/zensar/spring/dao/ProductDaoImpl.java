package com.zensar.spring.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

/*
* Author: Pickle Rick
* Creation Date: 30th July 2019 05.55 PM
* Modified Date: 31st July 2019 10.42 
* Version: 2.0
* Copyright: Zensar Technologies. All rights reserved.
* Description: Represents data access object interface.
*    
* */

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	public void insert(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.save(product);
	}

	public void update(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.update(product);
	}

	public void delete(Product product) {
		// TODO Auto-generated method stub
		hibernateTemplate.delete(product);
	}

	public Product getById(int productId) {
		// TODO Auto-generated method stub
		return hibernateTemplate.get(Product.class, productId);
	}

	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return hibernateTemplate.loadAll(Product.class);
	}

	

}
