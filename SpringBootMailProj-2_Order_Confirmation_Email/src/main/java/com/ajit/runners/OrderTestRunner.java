package com.ajit.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ajit.model.Order;
import com.ajit.service.IOrderMailService;

@Component
public class OrderTestRunner implements CommandLineRunner {

	@Autowired
	private IOrderMailService mailService;

	@Override
	public void run(String... args) throws Exception {

		Order order = new Order("ORD1023","ajitkr80923097@gmail.com","Mobile",1,5000.0);

		//Order order = new Order("ORD1023","rajesh.mahto.ds.2021@mitmeerut.ac.in","Laptop",1,55000.0);

		System.out.println("Order placed successfully!");
		System.out.println("Order ID: " + order.getOrderId());

		mailService.sendOrderConfirmation(order);
		
	}

}