/**
 * 
 */
package com.sam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.BillDAO;
import com.sam.model.Bill;

/**
 * @author sunny
 *
 */
@Service
public class BillServiceImpl implements BillService {

	@Autowired
	private BillDAO billDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.BillService#createBill(com.sam.model.Bill)
	 */
	@Override
	public Bill createBill(Bill bill) {
		return billDAO.save(bill);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.BillService#getBillById(java.lang.Long)
	 */
	@Override
	public Bill getBillById(Long id) {
		return billDAO.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.BillService#getAllBills()
	 */
	@Override
	public List<Bill> getAllBills() {
		return billDAO.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.BillService#updateBill(com.sam.model.Bill)
	 */
	@Override
	public Bill updateBill(Bill bill) {
		return billDAO.save(bill);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.BillService#deleteBill(java.lang.Long)
	 */
	@Override
	public void deleteBill(Long id) {
		billDAO.delete(id);
	}

}
