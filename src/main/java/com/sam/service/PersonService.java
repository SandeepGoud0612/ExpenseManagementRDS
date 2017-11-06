/**
 * 
 */
package com.sam.service;

import java.util.List;

import com.sam.model.Person;

/**
 * @author sunny
 *
 */
public interface PersonService {
	
	Person createPerson(final Person person);

	Person getPersonById(final Long id);

	List<Person> getAllPersons();

	Person updatePerson(final Person person);

	void deletePerson(final Long id);

}
