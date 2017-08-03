package com.test.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.test.main.dao.Shop;
@Service
@ComponentScan
public class ShopServiceImpl implements ShopService{
	@Autowired  
    private Shop shop;  
	public String findById() {
		return shop.find();
	}

}
