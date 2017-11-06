/**
 * 
 */
package com.sam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sam.model.Receiver;

/**
 * @author sunny
 *
 */
@Repository
public interface ReceiverDAO extends JpaRepository<Receiver, Long> {

}
