package com.javatechie.spring.api;



public class order {
	private String userName;
	private double amount;
	private String productName;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@Override
	public String toString() {
		return "order [userName=" + userName + ", amount=" + amount + ", productName=" + productName + "]";
	}
	
	
	

}
