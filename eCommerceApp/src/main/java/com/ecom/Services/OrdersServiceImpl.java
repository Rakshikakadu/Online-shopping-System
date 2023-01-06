package com.ecom.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Entity.Customers;
import com.ecom.Entity.Orders;
import com.ecom.Entity.Products;
import com.ecom.Exception.CustomerException;
import com.ecom.Exception.OrdersException;
import com.ecom.Exception.ProductException;
import com.ecom.Repository.CustomersRepo;
import com.ecom.Repository.OrdersRepo;
import com.ecom.Repository.ProductsRepo;


@Service
public class OrdersServiceImpl implements OrdersService {
	@Autowired
	private OrdersRepo ordersRepo;
	@Autowired
	private ProductsRepo productsRepo;
	@Autowired
	private CustomersRepo customersRepo;

	@Override
	public Orders addOrder(Orders orders, Integer customerId) throws OrdersException, CustomerException {

		Customers customer = customersRepo.findById(customerId)
				.orElseThrow(() -> new CustomerException("Customer Not found with this ID"));
		customer.getOrder().add(orders);
		orders.setCustomer(customer);

		Orders order = ordersRepo.save(orders);
		customersRepo.save(customer);

		if (order == null) {
			throw new OrdersException("Order can not be procced at this time..");
		}

		return order;
	}

	@Override
	public Orders deleteOrder(Integer orderId) throws OrdersException {

		Orders order = ordersRepo.findById(orderId)
				.orElseThrow(() -> new OrdersException("Order not found with orderId : " + orderId));

		ordersRepo.delete(order);
		return order;
	}

	@Override
	public Orders getOrderById(Integer orderId) throws OrdersException {
		return ordersRepo.findById(orderId)
				.orElseThrow(() -> new OrdersException("Order not found with orderId : " + orderId));
	}

	@Override
	public Orders addProducts(Integer orderId, Integer productId) throws OrdersException, ProductException {
		Products product = productsRepo.findById(productId)
				.orElseThrow(() -> new ProductException("Product not found with productId : " + productId));
		Orders order = ordersRepo.findById(orderId)
				.orElseThrow(() -> new OrdersException("Order not found with orderId : " + orderId));
		order.getProducts().add(product);
		ordersRepo.save(order);
		return order;
	}

	@Override
	public List<Orders> getAllOrders() throws OrdersException {

		List<Orders> list = ordersRepo.findAll();

		if (list.isEmpty()) {
			throw new OrdersException("No orders found..");
		}

		return list;
	}
}
