/**
 * 
 */
package com.sam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sam.dao.PersonDAO;
import com.sam.model.Person;

/**
 * @author sunny
 *
 */
@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDAO personDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PersonService#createPerson(com.sam.model.Person)
	 */
	@Override
	public Person createPerson(Person person) {
		return personDAO.save(person);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PersonService#getPersonById(java.lang.Long)
	 */
	@Override
	public Person getPersonById(Long id) {
		return personDAO.findOne(id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PersonService#getAllPersons()
	 */
	@Override
	public List<Person> getAllPersons() {
		return personDAO.findAll();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PersonService#updatePerson(com.sam.model.Person)
	 */
	@Override
	public Person updatePerson(Person person) {
		return personDAO.save(person);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sam.service.PersonService#deletePerson(java.lang.Long)
	 */
	@Override
	public void deletePerson(Long id) {
		personDAO.delete(id);
	}

}
