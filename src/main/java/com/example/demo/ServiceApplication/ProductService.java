package com.example.demo.ServiceApplication;

import java.util.Collection;

import com.example.demo.ModelClasses.Product;

public interface ProductService {
	
	 public abstract void createProduct(Product product);
	   public abstract void updateProduct(String id, Product product);
	   public abstract Collection<Product> getProducts();
	   public abstract void deleteProduct(String id);
}
