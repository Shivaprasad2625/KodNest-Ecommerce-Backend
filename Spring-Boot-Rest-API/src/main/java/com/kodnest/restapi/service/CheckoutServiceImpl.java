package com.kodnest.restapi.service;

import java.util.Set;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.restapi.dto.Purchase;
import com.kodnest.restapi.dto.PurchaseResponse;
import com.kodnest.restapi.entity.Customer;
import com.kodnest.restapi.entity.Order;
import com.kodnest.restapi.entity.OrderItem;
import com.kodnest.restapi.repository.CustomerRepository;

import jakarta.transaction.Transactional;
	
@Service
public class CheckoutServiceImpl implements CheckoutService{
	
	private CustomerRepository customerRepository; 
	
	@Autowired
	public CheckoutServiceImpl(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	
	@Override
	@Transactional
	public PurchaseResponse placeOrder(Purchase purchase) {
		//retrieve the order info from dto
		Order order  = purchase.getOrder();
		
		//generate tracking number
		String orderTrackingNumber = generateOrderTrackingNumber();
		order.setOrderTrackingNumber(orderTrackingNumber);
		
		//populate order with orderItems
		Set<OrderItem> orderItems = purchase.getOrderItems();
		orderItems.forEach(item -> order.add(item));
		
		//populate order with billingAddress and shippingAddress
		order.setBillingAddress(purchase.getBillingAddress());
		order.setShippingAddress(purchase.getShippingAddress());
		
		//populate customer with order
		Customer customer = purchase.getCustomer();
		customer.add(order);

		//save to the database
		customerRepository.save(customer);
		
		//return a response
		return new PurchaseResponse(orderTrackingNumber);
	}
	private String generateOrderTrackingNumber() {
		
		return UUID.randomUUID().toString();
	}

}
