/**
 * 
 */
package com.sam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.ReceiverDAO;
import com.sam.model.Receiver;

/**
 * @author sunny
 *
 */
@Service
public class ReceiverServiceImpl implements ReceiverService {

	@Autowired
	private ReceiverDAO receiverDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ReceiverService#createReceiver(com.sam.model.Receiver)
	 */
	@Override
	public Receiver createReceiver(Receiver receiver) {
		return receiverDAO.save(receiver);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ReceiverService#getReceiverById(java.lang.Long)
	 */
	@Override
	public Receiver getReceiverById(Long id) {
		return receiverDAO.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ReceiverService#getAllReceivers()
	 */
	@Override
	public List<Receiver> getAllReceivers() {
		return receiverDAO.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ReceiverService#updateReceiver(com.sam.model.Receiver)
	 */
	@Override
	public Receiver updateReceiver(Receiver receiver) {
		return receiverDAO.save(receiver);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.ReceiverService#deleteReceiver(java.lang.Long)
	 */
	@Override
	public void deleteReceiver(Long id) {
		receiverDAO.delete(id);
	}

}
