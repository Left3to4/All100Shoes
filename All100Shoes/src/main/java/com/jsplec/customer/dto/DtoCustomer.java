package com.jsplec.customer.dto;

public class DtoCustomer {
	String customerid;
	String customerpw;
	String customername;
	String customerphone;
	String customeraddress;
	String customerinitdate;
	String customerupdatedate;
	String customerdeletedate;
	
	
	
	
	
	
	
	public DtoCustomer(String customerid,String customername, String customerphone ) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.customerphone = customerphone;
	}
	public DtoCustomer(String customerid, String customerpw) {
		super();
		this.customerid = customerid;
		this.customerpw = customerpw;
	}
	public DtoCustomer(String customerid, String customername, String customerphone, String customeraddress) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.customerphone = customerphone;
		this.customeraddress = customeraddress;
	}
	public DtoCustomer(String customerid) {
		super();
		this.customerid = customerid;
	}
	public DtoCustomer(String customerid, String customerpw, String customername, String customerphone,
			String customeraddress) {
		super();
		this.customerid = customerid;
		this.customerpw = customerpw;
		this.customername = customername;
		this.customerphone = customerphone;
		this.customeraddress = customeraddress;
		
	}
	public String getCustomerid() {
		return customerid;
	}
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}
	public String getCustomerpw() {
		return customerpw;
	}
	public void setCustomerpw(String customerpw) {
		this.customerpw = customerpw;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getCustomerphone() {
		return customerphone;
	}
	public void setCustomerphone(String customerphone) {
		this.customerphone = customerphone;
	}
	public String getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}
	public String getCustomerinitdate() {
		return customerinitdate;
	}
	public void setCustomerinitdate(String customerinitdate) {
		this.customerinitdate = customerinitdate;
	}
	public String getCustomerupdatedate() {
		return customerupdatedate;
	}
	public void setCustomerupdatedate(String customerupdatedate) {
		this.customerupdatedate = customerupdatedate;
	}
	public String getCustomerdeletedate() {
		return customerdeletedate;
	}
	public void setCustomerdeletedate(String customerdeletedate) {
		this.customerdeletedate = customerdeletedate;
	}

	
	

	
}