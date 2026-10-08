package com.dcl;

public class Bank {
    private int amount=10000;
    
//    public int readAmount() {
//    	return amount;
//    }
//    public void modifyAmount(int amount) {
//    	this.amount=+amount;
//    }
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
	
		this.amount +=amount;
	}
}
