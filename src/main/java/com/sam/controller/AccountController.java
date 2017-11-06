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

import com.sam.model.Account;
import com.sam.service.AccountService;

/**
 * @author sunny
 *
 */
@RestController
@RequestMapping(value = "/accounts")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Account> createAccount(@RequestBody final Account account) {
		Account newAccount = accountService.createAccount(account);
		return new ResponseEntity<Account>(newAccount, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Account> getAccountById(@PathVariable final Long id) {
		Account account = accountService.getAccountById(id);
		return new ResponseEntity<Account>(account, HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Account>> getAllAccounts() {
		List<Account> accounts = accountService.getAllAccounts();
		return new ResponseEntity<List<Account>>(accounts, HttpStatus.OK);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Account> updateAccount(@PathVariable final Long id, @RequestBody final Account account) {
		Account existingAccount = accountService.getAccountById(id);
		if (existingAccount.getId() != null) {
			Account updatedAccount = accountService.updateAccount(account);
			return new ResponseEntity<Account>(updatedAccount, HttpStatus.OK);
		} else {
			return new ResponseEntity<Account>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteAccount(@PathVariable final Long id) {
		accountService.deleteAccount(id);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
