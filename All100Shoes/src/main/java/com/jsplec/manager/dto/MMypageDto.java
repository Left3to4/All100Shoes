package com.jsplec.manager.dto;

public class MMypageDto {

	String managerid;
	String managername;
	String managerpw;
	String managerphone;
	
	public MMypageDto() {
		
	}
	
	public MMypageDto(String managerid, String managername, String managerpw, String managerphone) {
		super();
		this.managerid = managerid;
		this.managername = managername;
		this.managerpw = managerpw;
		this.managerphone = managerphone;
	}

	public String getManagerid() {
		return managerid;
	}
	public void setManagerid(String managerid) {
		this.managerid = managerid;
	}
	public String getManagername() {
		return managername;
	}
	public void setManagername(String managername) {
		this.managername = managername;
	}
	public String getManagerpw() {
		return managerpw;
	}
	public void setManagerpw(String managerpw) {
		this.managerpw = managerpw;
	}
	public String getManagerphone() {
		return managerphone;
	}
	public void setManagerphone(String managerphone) {
		this.managerphone = managerphone;
	}
	
	
}
