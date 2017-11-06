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
public class PaymentType extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2685519133328448697L;

	@NotNull
	@Column(length = 100, nullable = false, unique = true)
	@Size(min = 1, max = 100)
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
