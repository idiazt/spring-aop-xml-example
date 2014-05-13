package com.idiazt.springaopxmlexample.service.impl;

import java.util.Collection;

import org.springframework.stereotype.Service;

import com.idiazt.springaopxmlexample.dao.ProductDAO;
import com.idiazt.springaopxmlexample.entities.Product;
import com.idiazt.springaopxmlexample.service.IService;

@Service
public class ProductService implements IService<Product> {

	@Override
	public Product persist(Product product) throws Exception {
		throw new Exception("Probando rollback");
		//return ProductDAO.getInstance().persist(product);
	}

	@Override
	public Collection<Product> list() {
		return ProductDAO.getInstance().list();
	}

	@Override
	public Product findById(Long id) {
		return ProductDAO.getInstance().findById(id);
	}

	@Override
	public boolean delete(Long id) {
		return ProductDAO.getInstance().delete(id);
	}

}
