/**
 * 
 */
package com.sam.service;

import java.util.List;

import com.sam.model.Bill;

/**
 * @author sunny
 *
 */
public interface BillService {

	Bill createBill(final Bill bill);

	Bill getBillById(final Long id);

	List<Bill> getAllBills();

	Bill updateBill(final Bill bill);

	void deleteBill(final Long id);

}
