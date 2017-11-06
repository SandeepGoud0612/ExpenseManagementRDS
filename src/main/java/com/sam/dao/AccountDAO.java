/**
 * 
 */
package com.sam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sam.model.Account;

/**
 * @author sunny
 *
 */
@Repository
public interface AccountDAO extends JpaRepository<Account, Long> {

}
