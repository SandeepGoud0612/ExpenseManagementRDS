/**
 * 
 */
package com.sam.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Transient;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.sam.enums.Gender;

/**
 * @author sunny
 *
 */
@Entity
public class Person extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3148693138108762165L;

	@Transient
	private static final long PHONE_MAX = 999999999999L;

	@NotNull
	@Column(length = 50, nullable = false)
	@Size(min = 1, max = 50)
	private String firstName;

	@NotNull
	@Column(length = 50, nullable = false)
	@Size(min = 1, max = 50)
	private String lastName;

	@Column(length = 10)
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Column(length = 3)
	@Max(150)
	private Integer age;

	@Column(length = 150)
	@Size(max = 150)
	private String address;

	@Column(length = 12)
	@Max(PHONE_MAX)
	private Long phoneNumber;

	@Column(length = 12)
	@Max(PHONE_MAX)
	private Long altPhoneNumber;

	@Column(length = 100)
	@Size(max = 100)
	private String email;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the phoneNumber
	 */
	public Long getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 */
	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the altPhoneNumber
	 */
	public Long getAltPhoneNumber() {
		return altPhoneNumber;
	}

	/**
	 * @param altPhoneNumber
	 *            the altPhoneNumber to set
	 */
	public void setAltPhoneNumber(Long altPhoneNumber) {
		this.altPhoneNumber = altPhoneNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
