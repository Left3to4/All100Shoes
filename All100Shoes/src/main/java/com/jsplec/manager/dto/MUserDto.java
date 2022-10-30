package com.jsplec.manager.dto;

import java.sql.Timestamp;

public class MUserDto {

	// F
	int customerseq;
	String customerid;
	String customername;
	String customrephone;
	String customeraddress;
	Timestamp customerinitdate;
	Timestamp customerupdatedate;
	Timestamp customerdeletedate;
	
	// C
	public MUserDto() {
		// TODO Auto-generated constructor stub
	}

	public MUserDto(int customerseq, String customerid, String customername, String customrephone, String customeraddress,
			Timestamp customerinitdate, Timestamp customerupdatedate, Timestamp customerdeletedate) {
		super();
		
		this.customerseq = customerseq;
		this.customerid = customerid;
		this.customername = customername;
		this.customrephone = customrephone;
		this.customeraddress = customeraddress;
		this.customerinitdate = customerinitdate;
		this.customerupdatedate = customerupdatedate;
		this.customerdeletedate = customerdeletedate;
	}

	// M
	public int getCustomerseq() {
		return customerseq;
	}

	public void setCustomerseq(int customerseq) {
		this.customerseq = customerseq;
	}
	
	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getCustomrephone() {
		return customrephone;
	}

	public void setCustomrephone(String customrephone) {
		this.customrephone = customrephone;
	}

	public String getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}

	public Timestamp getCustomerinitdate() {
		return customerinitdate;
	}

	public void setCustomerinitdate(Timestamp customerinitdate) {
		this.customerinitdate = customerinitdate;
	}

	public Timestamp getCustomerupdatedate() {
		return customerupdatedate;
	}

	public void setCustomerupdatedate(Timestamp customerupdatedate) {
		this.customerupdatedate = customerupdatedate;
	}

	public Timestamp getCustomerdeletedate() {
		return customerdeletedate;
	}

	public void setCustomerdeletedate(Timestamp customerdeletedate) {
		this.customerdeletedate = customerdeletedate;
	}
	
	
	
	
}
