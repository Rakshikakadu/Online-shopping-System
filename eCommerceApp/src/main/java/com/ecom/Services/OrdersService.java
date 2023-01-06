package com.ecom.Services;

import java.util.List;

import com.ecom.Entity.Orders;
import com.ecom.Exception.CustomerException;
import com.ecom.Exception.OrdersException;
import com.ecom.Exception.ProductException;

public interface OrdersService {
	
	public Orders addOrder(Orders orders, Integer customerId) throws OrdersException, CustomerException;

	public Orders deleteOrder(Integer orderId) throws OrdersException;

	public Orders getOrderById(Integer orderId) throws OrdersException;

	public Orders addProducts(Integer orderId, Integer productId) throws OrdersException, ProductException;

	public List<Orders> getAllOrders() throws OrdersException;
	
}
