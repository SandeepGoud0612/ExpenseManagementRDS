/**
 * 
 */
package com.sam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.PayerDAO;
import com.sam.model.Payer;

/**
 * @author sunny
 *
 */
@Service
public class PayerServiceImpl implements PayerService {

	@Autowired
	private PayerDAO payerDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PayerService#createPayer(com.sam.model.Payer)
	 */
	@Override
	public Payer createPayer(Payer payer) {
		return payerDAO.save(payer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PayerService#getPayerById(java.lang.Long)
	 */
	@Override
	public Payer getPayerById(Long id) {
		return payerDAO.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PayerService#getAllPayers()
	 */
	@Override
	public List<Payer> getAllPayers() {
		return payerDAO.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PayerService#updatePayer(com.sam.model.Payer)
	 */
	@Override
	public Payer updatePayer(Payer payer) {
		return payerDAO.save(payer);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PayerService#deletePayer(java.lang.Long)
	 */
	@Override
	public void deletePayer(Long id) {
		payerDAO.delete(id);
	}

}
