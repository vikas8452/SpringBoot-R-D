package com.example.demo.ModelClasses;

public class Product {
	
	public Product() {
		super();
	}
	private String  id;
	private String name;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	

}
