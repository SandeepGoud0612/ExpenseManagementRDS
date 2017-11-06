/**
 * 
 */
package com.sam.service;

import java.util.List;

import com.sam.model.Payer;

/**
 * @author sunny
 *
 */
public interface PayerService {
	
	Payer createPayer(final Payer payer);

	Payer getPayerById(final Long id);

	List<Payer> getAllPayers();

	Payer updatePayer(final Payer payer);

	void deletePayer(final Long id);

}
