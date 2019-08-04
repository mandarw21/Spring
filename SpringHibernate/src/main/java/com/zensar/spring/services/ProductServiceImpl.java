package com.zensar.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.entities.Product;
import com.zensar.spring.dao.ProductDao;

/*
* Author: Pickle Rick
* Creation Date: 25th July 2019 05.55 PM
* Modified Date: 30th July 2019 17.00 
* Version: 1.0
* 
* Copyright: Zensar Technologies. All rights reserved.
* Description: Represents product services which can be accessed by
* presentation layer.
* It encapsulates business logic of product entity   
* 
* */
@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	
	@Autowired
	private ProductDao dao;
	
	public void create(Product product) {
		// TODO Auto-generated method stub
		dao.insert(product);
	}

	public void edit(Product product) {
		// TODO Auto-generated method stub
		Product dbproduct = findbyProductId(product.getProductId());
		if (dbproduct!=null) {
			dbproduct.setName(product.getName());
			dbproduct.setBrand(product.getBrand());
			dbproduct.setPrice(product.getPrice());
			dao.update(dbproduct);
		}else {
			System.out.println("Sorry Product Doesn't Exist");
		}
	}

	public void remove(Product product) {
		// TODO Auto-generated method stub
		Product dbproduct = findbyProductId(product.getProductId());
		if (dbproduct!=null) {
			
			dao.delete(dbproduct);
		}else {
			System.out.println("Sorry Product Doesn't Exist");
		}
	}

	public Product findbyProductId(int productId) {
		// TODO Auto-generated method stub
		return dao.getById(productId);
	}

	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

	
	

}
