package com.cloudshare.document;

import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "payment_transactions")
public class PaymentTransaction {

    private String id;
    private String clerkId;
    private String orderId;
    private String paymentId;
    private String planId;
    private int amount;
    private String currency;
    private int creditsAdded;
    private String status;
    private LocalDateTime transactionDate;

    private String userEmail;
    private String userName;
    
	public PaymentTransaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentTransaction(String id, String clerkId, String orderId, String paymentId, String planId, int amount,
			String currency, int creditsAdded, String status, LocalDateTime transactionDate, String userEmail,
			String userName) {
		super();
		this.id = id;
		this.clerkId = clerkId;
		this.orderId = orderId;
		this.paymentId = paymentId;
		this.planId = planId;
		this.amount = amount;
		this.currency = currency;
		this.creditsAdded = creditsAdded;
		this.status = status;
		this.transactionDate = transactionDate;
		this.userEmail = userEmail;
		this.userName = userName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getClerkId() {
		return clerkId;
	}

	public void setClerkId(String clerkId) {
		this.clerkId = clerkId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getCreditsAdded() {
		return creditsAdded;
	}

	public void setCreditsAdded(int creditsAdded) {
		this.creditsAdded = creditsAdded;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(LocalDateTime transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
    
	
    
}
