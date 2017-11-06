/**
 * 
 */
package com.sam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.PaymentDAO;
import com.sam.model.Payment;

/**
 * @author sunny
 *
 */
@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentDAO paymentDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PaymentService#createPayment(com.sam.model.Payment)
	 */
	@Override
	public Payment createPayment(Payment payment) {
		return paymentDAO.save(payment);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PaymentService#getPaymentById(java.lang.Long)
	 */
	@Override
	public Payment getPaymentById(Long id) {
		return paymentDAO.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PaymentService#getAllPayments()
	 */
	@Override
	public List<Payment> getAllPayments() {
		return paymentDAO.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PaymentService#updatePayment(com.sam.model.Payment)
	 */
	@Override
	public Payment updatePayment(Payment payment) {
		return paymentDAO.save(payment);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PaymentService#deletePayment(java.lang.Long)
	 */
	@Override
	public void deletePayment(Long id) {
		paymentDAO.delete(id);
	}

}
