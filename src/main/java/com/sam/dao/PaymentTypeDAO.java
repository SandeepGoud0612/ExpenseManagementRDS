/**
 * 
 */
package com.sam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sam.model.PaymentType;

/**
 * @author sunny
 *
 */
@Repository
public interface PaymentTypeDAO extends JpaRepository<PaymentType, Long> {

}
