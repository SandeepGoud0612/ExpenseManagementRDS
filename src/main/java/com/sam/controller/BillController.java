/**
 * 
 */
package com.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sam.model.Bill;
import com.sam.service.BillService;

/**
 * @author sunny
 *
 */
@RestController
@RequestMapping(value = "/bills")
public class BillController {

	@Autowired
	private BillService billService;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Bill> createBill(@RequestBody final Bill bill) {
		Bill newBill = billService.createBill(bill);
		return new ResponseEntity<Bill>(newBill, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Bill> getBillByID(@PathVariable final Long id) {
		Bill bill = billService.getBillById(id);
		return new ResponseEntity<Bill>(bill, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Bill>> getAllBills() {
		List<Bill> bills = billService.getAllBills();
		return new ResponseEntity<List<Bill>>(bills, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Bill> updateBill(@PathVariable final Long id, @RequestBody final Bill bill) {
		Bill existingBill = billService.getBillById(id);
		if (existingBill.getId() != null) {
			Bill updatedBill = billService.updateBill(bill);
			return new ResponseEntity<Bill>(updatedBill, HttpStatus.OK);
		} else {
			return new ResponseEntity<Bill>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteBill(@PathVariable final Long id) {
		billService.deleteBill(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
