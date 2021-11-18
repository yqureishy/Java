package com.dollarsbank.model;

import java.util.Date;

public class Transaction {
	
	Date date;
	
	Double balanceInitial;
	
	Double balanceAfter;
	
	
	
	
	
	
	
	

	public Transaction(Date date, Double balanceInitial, Double balanceAfter) {
		super();
		this.date = date;
		this.balanceInitial = balanceInitial;
		this.balanceAfter = balanceAfter;
	}
	

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
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
