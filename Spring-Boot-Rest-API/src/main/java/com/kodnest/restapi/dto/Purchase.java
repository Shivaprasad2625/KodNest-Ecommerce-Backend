package com.kodnest.restapi.dto;

import java.util.Set;

import com.kodnest.restapi.entity.Address;
import com.kodnest.restapi.entity.Customer;
import com.kodnest.restapi.entity.Order;
import com.kodnest.restapi.entity.OrderItem;

public class Purchase {
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Address getShippingAddress() {
		return shippingAddress;
	}
	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}
	public Address getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	
	private Customer customer;
	private Address shippingAddress;
	private Address billingAddress;
	private Order order;
	private Set<OrderItem> orderItems;
	
	public Purchase(Customer customer, Address shippingAddress, Address billingAddress, Order order,
			Set<OrderItem> orderItems) {
		super();
		this.customer = customer;
		this.shippingAddress = shippingAddress;
		this.billingAddress = billingAddress;
		this.order = order;
		this.orderItems = orderItems;
	}
	public Purchase() {
		super();
		// TODO Auto-generated constructor stub
	}
}	
