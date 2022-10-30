package com.jsplec.manager.dto;

import java.sql.Timestamp;

public class MHistoryDto {

	// F
	String productmodel;
	String productsize;
	
	int buyid;
	int buyprice;
	Timestamp buyorderdate;
	int buyquantity;
	
	
	// C
	public MHistoryDto() {
		// TODO Auto-generated constructor stub
	}

	public MHistoryDto(int buyid, String productmodel, String productsize, int buyprice, Timestamp buyorderdate, int buyquantity) {
		super();
		this.buyid = buyid;
		this.productmodel = productmodel;
		this.productsize = productsize;
		this.buyprice = buyprice;
		this.buyorderdate = buyorderdate;
		this.buyquantity = buyquantity;
	}

	// M
	public int getBuyid() {
		return buyid;
	}

	public void setBuyid(int buyid) {
		this.buyid = buyid;
	}

	public String getProductmodel() {
		return productmodel;
	}
	
	public void setProductmodel(String productmodel) {
		this.productmodel = productmodel;
	}


	public String getProductsize() {
		return productsize;
	}


	public void setProductsize(String productsize) {
		this.productsize = productsize;
	}


	public int getBuyprice() {
		return buyprice;
	}


	public void setBuyprice(int buyprice) {
		this.buyprice = buyprice;
	}


	public Timestamp getBuyorderdate() {
		return buyorderdate;
	}


	public void setBuyorderdate(Timestamp buyorderdate) {
		this.buyorderdate = buyorderdate;
	}


	public int getBuyquantity() {
		return buyquantity;
	}


	public void setBuyquantity(int buyquantity) {
		this.buyquantity = buyquantity;
	}
	
} // End
