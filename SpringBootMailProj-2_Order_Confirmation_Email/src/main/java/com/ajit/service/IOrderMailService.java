package com.ajit.service;

import com.ajit.model.Order;

public interface IOrderMailService {

	void sendOrderConfirmation(Order order);
}