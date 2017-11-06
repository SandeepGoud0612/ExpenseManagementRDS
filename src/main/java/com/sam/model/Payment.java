/**
 * 
 */
package com.sam.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author sunny
 *
 */
@Entity
public class Payment extends BaseEntity implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 58505202814439503L;

	@ManyToOne
	@JoinColumn(nullable = false)
	@NotNull
	private Account account;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	@NotNull
	private Bill bill;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	@NotNull
	private PaymentType paymentType;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	@NotNull
	private Payer payer;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	@NotNull
	private Receiver receiver;
	
	@Column(nullable = false)
	@NotNull
	@Min(value = 0)
	private Double amount;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}

	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}

	/**
	 * @return the bill
	 */
	public Bill getBill() {
		return bill;
	}

	/**
	 * @param bill the bill to set
	 */
	public void setBill(Bill bill) {
		this.bill = bill;
	}

	/**
	 * @return the paymentType
	 */
	public PaymentType getPaymentType() {
		return paymentType;
	}

	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(PaymentType paymentType) {
		this.paymentType = paymentType;
	}

	/**
	 * @return the payer
	 */
	public Payer getPayer() {
		return payer;
	}

	/**
	 * @param payer the payer to set
	 */
	public void setPayer(Payer payer) {
		this.payer = payer;
	}

	/**
	 * @return the receiver
	 */
	public Receiver getReceiver() {
		return receiver;
	}

	/**
	 * @param receiver the receiver to set
	 */
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}

	/**
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}	 
	
	

}
