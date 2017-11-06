/**
 * 
 */
package com.sam.service;

import java.util.List;

import com.sam.model.Account;

/**
 * @author sunny
 *
 */
public interface AccountService {

	Account createAccount(final Account account);

	Account getAccountById(final Long id);

	List<Account> getAllAccounts();

	Account updateAccount(final Account account);

	void deleteAccount(final Long id);

}
