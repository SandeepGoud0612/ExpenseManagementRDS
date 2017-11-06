/**
 * 
 */
package com.sam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.AccountDAO;
import com.sam.model.Account;

/**
 * @author sunny
 *
 */
@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDAO accountDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.AccountService#createAccount(com.sam.model.Account)
	 */
	@Override
	public Account createAccount(Account account) {
		return accountDAO.save(account);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.AccountService#getAccountById(java.lang.Long)
	 */
	@Override
	public Account getAccountById(Long id) {
		return accountDAO.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.AccountService#getAllAccounts()
	 */
	@Override
	public List<Account> getAllAccounts() {
		return accountDAO.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.AccountService#updateAccount(com.sam.model.Account)
	 */
	@Override
	public Account updateAccount(Account account) {
		return accountDAO.save(account);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.AccountService#deleteAccount(java.lang.Long)
	 */
	@Override
	public void deleteAccount(Long id) {
		accountDAO.delete(id);
	}

}
