/**
 * 
 */
package com.sam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sam.model.Payment;

/**
 * @author sunny
 *
 */
@Repository
public interface PaymentDAO extends JpaRepository<Payment, Long> {

}
