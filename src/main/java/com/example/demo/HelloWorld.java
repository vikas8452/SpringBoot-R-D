package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ModelClasses.Product;

@RestController
public class HelloWorld {
	
	
	
	static Map<String,Product> mm=new HashMap<>();
	
	
	static {
		 Product honey = new Product();
	      honey.setId("1");
	      honey.setName("Honey");
	      mm.put(honey.getId(), honey);      
	      Product almond = new Product();
	      almond.setId("2");
	      almond.setName("Almond");
	      mm.put(almond.getId(), almond);      
		}
	@RequestMapping("/products")
	@ResponseBody
	
	public ResponseEntity<Object> hello()
	{
		return (new ResponseEntity<>(mm.values(),HttpStatus.OK));
		
	}
	
	@RequestMapping(value="/products/{id}",method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("id")String id)
	{
		
		System.out.println("Product removed "+mm.get(id).getName());
		mm.remove(id);
	}


}
