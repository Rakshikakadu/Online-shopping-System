package com.ecom.Services;

import java.util.List;

import com.ecom.Entity.Payments;
import com.ecom.Exception.CustomerException;
import com.ecom.Exception.OrdersException;
import com.ecom.Exception.PaymentException;

public interface PaymentsService {
	public Payments makePayment(Payments payment, Integer orderId, Integer customerId)
			throws PaymentException, OrdersException, CustomerException;

	public Payments getPaymentByID(Integer paymentId) throws PaymentException;

	public List<Payments> getAllPayments() throws PaymentException;
}
