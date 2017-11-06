/**
 * 
 */
package com.sam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sam.model.Bill;

/**
 * @author sunny
 *
 */
@Repository
public interface BillDAO extends JpaRepository<Bill, Long> {

}
