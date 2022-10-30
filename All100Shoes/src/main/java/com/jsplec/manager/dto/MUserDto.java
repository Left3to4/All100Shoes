package com.jsplec.manager.dto;

import java.sql.Date;
import java.sql.Timestamp;

public class MUserDto {

	// F
	int customerseq;
	String customerid;
	String customername;
	String customerphone;
	String customeraddress;
	Date customerinitdate;
	Date customerupdatedate;
	Date customerdeletedate;
	
	// C
	public MUserDto() {
		// TODO Auto-generated constructor stub
	}

	public MUserDto(int customerseq, String customerid, String customername, String customerphone, String customeraddress,
			Date customerinitdate, Date customerupdatedate, Date customerdeletedate) {
		super();
		
		this.customerseq = customerseq;
		this.customerid = customerid;
		this.customername = customername;
		this.customerphone = customerphone;
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

	public String getCustomerphone() {
		return customerphone;
	}

	public void setCustomerphone(String customrephone) {
		this.customerphone = customrephone;
	}

	public String getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}

	public Date getCustomerinitdate() {
		return customerinitdate;
	}

	public void setCustomerinitdate(Date customerinitdate) {
		this.customerinitdate = customerinitdate;
	}

	public Date getCustomerupdatedate() {
		return customerupdatedate;
	}

	public void setCustomerupdatedate(Date customerupdatedate) {
		this.customerupdatedate = customerupdatedate;
	}

	public Date getCustomerdeletedate() {
		return customerdeletedate;
	}

	public void setCustomerdeletedate(Date customerdeletedate) {
		this.customerdeletedate = customerdeletedate;
	}
	
	
	
	
}
