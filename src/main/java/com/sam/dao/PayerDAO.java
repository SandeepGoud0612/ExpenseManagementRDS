/**
 * 
 */
package com.sam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sam.model.Payer;

/**
 * @author sunny
 *
 */
@Repository
public interface PayerDAO extends JpaRepository<Payer, Long> {

}
