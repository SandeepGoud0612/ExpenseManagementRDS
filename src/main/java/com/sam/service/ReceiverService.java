/**
 * 
 */
package com.sam.service;

import java.util.List;

import com.sam.model.Receiver;

/**
 * @author sunny
 *
 */
public interface ReceiverService {
	
	Receiver createReceiver(final Receiver receiver);

	Receiver getReceiverById(final Long id);

	List<Receiver> getAllReceivers();

	Receiver updateReceiver(final Receiver receiver);

	void deleteReceiver(final Long id);

}
