package com.jsplec.customer.dto;

import java.sql.Date;

public class SCustomerBuyListDto {

	String produdctbrand;
	String productmodel;
	String productsize;
	int orderquantity;
	int orderprice;
	Date orderdate;
	
	public SCustomerBuyListDto() {
		// TODO Auto-generated constructor stub
	}

	
	
	public SCustomerBuyListDto(String produdctbrand, String productmodel, String productsize, int orderquantity,
			int orderprice, Date orderdate) {
		super();
		this.produdctbrand = produdctbrand;
		this.productmodel = productmodel;
		this.productsize = productsize;
		this.orderquantity = orderquantity;
		this.orderprice = orderprice;
		this.orderdate = orderdate;
	}



	public String getProdudctbrand() {
		return produdctbrand;
	}

	public void setProdudctbrand(String produdctbrand) {
		this.produdctbrand = produdctbrand;
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

	public int getOrderquantity() {
		return orderquantity;
	}

	public void setOrderquantity(int orderquantity) {
		this.orderquantity = orderquantity;
	}

	public int getOrderprice() {
		return orderprice;
	}

	public void setOrderprice(int orderprice) {
		this.orderprice = orderprice;
	}

	public Date getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(Date orderdate) {
		this.orderdate = orderdate;
	}
	
	
	
}
