package com.test.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.main.service.ShopService;
@RestController 
public class ShopController {
	 @Autowired  
	 private ShopService shopService;  
	 @RequestMapping("/find")  
	 public String find() {
	     return shopService.findById();  
	}  
}
