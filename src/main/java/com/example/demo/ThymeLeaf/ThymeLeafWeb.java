package com.example.demo.ThymeLeaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThymeLeafWeb {
	
	@RequestMapping("/viewProducts")
	public String open()
	{
		return "view-product";		
	}

}
