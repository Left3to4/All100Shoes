package com.jsplec.customer.dto;

public class SCustomerDetailDto {

	int productid;
	String productmodel;
	int productprice;
	String productsize;
	int productstock;
	
	public SCustomerDetailDto() {
		// TODO Auto-generated constructor stub
	}

	
	


	public SCustomerDetailDto(int productid) {
		super();
		this.productid = productid;
	}

	//	productDetail2
	public SCustomerDetailDto(String productsize, int productstock) {
		super();
		this.productsize = productsize;
		this.productstock = productstock;
	}

	public SCustomerDetailDto(int productid, int productprice, String productmodel) {
		super();
		this.productid = productid;
		this.productprice = productprice;
		this.productmodel = productmodel;
	}





	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductsize() {
		return productsize;
	}

	public void setProductsize(String productsize) {
		this.productsize = productsize;
	}

	public int getProductstock() {
		return productstock;
	}

	public void setProductstock(int productstock) {
		this.productstock = productstock; 
	}

	public String getProductmodel() {
		return productmodel;
	}

	public void setProductmodel(String productmodel) {
		this.productmodel = productmodel;
	}

	public int getProductprice() {
		return productprice;
	}

	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}

	
	





	
	
}
