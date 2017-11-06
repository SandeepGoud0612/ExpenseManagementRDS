/**
 * 
 */
package com.sam.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author sunny
 *
 */
@Entity
public class Account extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6035739389671742462L;

	@NotNull
	@Column(length = 50, nullable = false, unique = true)
	@Size(min = 1, max = 50)
	private String name;

	@Column(length = 300)
	private String description;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
}
