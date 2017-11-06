/**
 * 
 */
package com.sam.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

/**
 * @author sunny
 *
 */
@Entity
public class Payer extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -416167388503213935L;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSON_ID", nullable = false, unique = true)
	@NotNull
	private Person person;

	/**
	 * @return the person
	 */
	public Person getPerson() {
		return person;
	}

	/**
	 * @param person
	 *            the person to set
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

}
