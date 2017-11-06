/**
 * 
 */
package com.sam.service;

import java.util.List;

import com.sam.model.Payment;

/**
 * @author sunny
 *
 */
public interface PaymentService {
	
	Payment createPayment(final Payment payment);

	Payment getPaymentById(final Long id);

	List<Payment> getAllPayments();

	Payment updatePayment(final Payment payment);

	void deletePayment(final Long id);

}
