/**
 * 
 */
package com.sam.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sam.model.Person;

/**
 * @author sunny
 *
 */
@Repository
public interface PersonDAO extends JpaRepository<Person, Long> {

}
