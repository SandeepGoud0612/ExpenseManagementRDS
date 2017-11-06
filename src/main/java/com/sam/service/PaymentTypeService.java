/**
 * 
 */
package com.sam.service;

import java.util.List;

import com.sam.model.PaymentType;

/**
 * @author sunny
 *
 */
public interface PaymentTypeService {
	
	PaymentType createPaymentType(final PaymentType paymentType);

	PaymentType getPaymentTypeById(final Long id);

	List<PaymentType> getAllPaymentTypes();

	PaymentType updatePaymentType(final PaymentType paymentType);

	void deletePaymentType(final Long id);

}
