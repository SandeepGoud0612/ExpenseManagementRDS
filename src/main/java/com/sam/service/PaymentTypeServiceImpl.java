/**
 * 
 */
package com.sam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.PaymentTypeDAO;
import com.sam.model.PaymentType;

/**
 * @author sunny
 *
 */
@Service
public class PaymentTypeServiceImpl implements PaymentTypeService {

	@Autowired
	private PaymentTypeDAO paymentTypeDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PaymentTypeService#createPaymentType(com.sam.model.
	 * PaymentType)
	 */
	@Override
	public PaymentType createPaymentType(PaymentType paymentType) {
		return paymentTypeDAO.save(paymentType);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PaymentTypeService#getPaymentTypeById(java.lang.Long)
	 */
	@Override
	public PaymentType getPaymentTypeById(Long id) {
		return paymentTypeDAO.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PaymentTypeService#getAllPaymentTypes()
	 */
	@Override
	public List<PaymentType> getAllPaymentTypes() {
		return paymentTypeDAO.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PaymentTypeService#updatePaymentType(com.sam.model.
	 * PaymentType)
	 */
	@Override
	public PaymentType updatePaymentType(PaymentType paymentType) {
		return paymentTypeDAO.save(paymentType);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PaymentTypeService#deletePaymentType(java.lang.Long)
	 */
	@Override
	public void deletePaymentType(Long id) {
		paymentTypeDAO.delete(id);
	}

}
