package com.kodnest.restapi.service;

import com.kodnest.restapi.dto.Purchase;
import com.kodnest.restapi.dto.PurchaseResponse;

public interface CheckoutService {
	PurchaseResponse placeOrder(Purchase purchase);
}
