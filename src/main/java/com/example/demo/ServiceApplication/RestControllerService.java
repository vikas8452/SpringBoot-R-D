package com.example.demo.ServiceApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerService {

	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/productt")
	public ResponseEntity<Object> getProduct()
	{
		
		return  new ResponseEntity<>(productService.getProducts(),HttpStatus.OK);
		
	}
	
}
