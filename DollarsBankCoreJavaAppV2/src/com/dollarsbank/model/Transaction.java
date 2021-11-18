package com.dollarsbank.model;


import java.time.LocalDateTime;


public class Transaction {
	
	String date;
	
	Double balanceInitial;
	
	Double balanceAfter;
	
	
	
	
	
	
	
	

	public Transaction(String date, Double balanceInitial, Double balanceAfter) {
		super();
		this.date = date;
		this.balanceInitial = balanceInitial;
		this.balanceAfter = balanceAfter;
	}
	

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getBalanceInitial() {
		return balanceInitial;
	}

	public void setBalanceInitial(Double balanceInitial) {
		this.balanceInitial = balanceInitial;
	}

	public Double getBalanceAfter() {
		return balanceAfter;
	}

	public void setBalanceAfter(Double balanceAfter) {
		this.balanceAfter = balanceAfter;
	}


	@Override
	public String toString() {
		return "Transaction [date=" + date + ", balanceInitial=" + balanceInitial + ", balanceAfter=" + balanceAfter
				+ "]";
	}
	
	
	
	
	
	
	

}
