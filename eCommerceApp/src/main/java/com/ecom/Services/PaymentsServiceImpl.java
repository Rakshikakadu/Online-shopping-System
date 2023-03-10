package com.ecom.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.Entity.Customers;
import com.ecom.Entity.Orders;
import com.ecom.Entity.Payments;
import com.ecom.Exception.CustomerException;
import com.ecom.Exception.OrdersException;
import com.ecom.Exception.PaymentException;
import com.ecom.Repository.CustomersRepo;
import com.ecom.Repository.OrdersRepo;
import com.ecom.Repository.PaymentsRepo;


@Service
public class PaymentsServiceImpl implements PaymentsService {

	@Autowired
	private PaymentsRepo paymentsRepo;
	@Autowired
	private OrdersRepo ordersRepo;
	@Autowired
	private CustomersRepo customersRepo;

	@Override
	public Payments makePayment(Payments payment, Integer orderId, Integer customerId)
			throws PaymentException, OrdersException, CustomerException {
		Customers customers = customersRepo.findById(customerId)
				.orElseThrow(() -> new CustomerException("Customer not exists."));
		Orders order = ordersRepo.findById(orderId).orElseThrow(() -> new OrdersException("Order not exists."));
		customers.getPayment().add(payment);
		order.setPayment(payment);
		payment.setCustomer(customers);
		payment.setOrder(order);
		Payments payments = paymentsRepo.save(payment);
		if (payments == null) {
			throw new PaymentException("Payment rejected.");
		}
		customersRepo.save(customers);
		ordersRepo.save(order);
		return payments;
	}

	@Override
	public Payments getPaymentByID(Integer paymentId) throws PaymentException {
		Payments payment = paymentsRepo.findById(paymentId)
				.orElseThrow(() -> new PaymentException("No payment found with paymentId : " + paymentId));
		return payment;
	}

	@Override
	public List<Payments> getAllPayments() throws PaymentException {
		List<Payments> payments = paymentsRepo.findAll();
		if (payments.isEmpty()) {
			throw new PaymentException("No payments found.");
		}
		return payments;
	}

}
