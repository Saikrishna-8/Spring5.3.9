package com.sai.beans;

public class Account {
	
	private String accNo;
	private String accName;
	private String accType;
	private String accMobile;
	private String accEmail;
	private String accAddr;
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public String getAccMobile() {
		return accMobile;
	}
	public void setAccMobile(String accMobile) {
		this.accMobile = accMobile;
	}
	public String getAccEmail() {
		return accEmail;
	}
	public void setAccEmail(String accEmail) {
		this.accEmail = accEmail;
	}
	public String getAccAddr() {
		return accAddr;
	}
	public void setAccAddr(String accAddr) {
		this.accAddr = accAddr;
	}
	
	
	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", accType=" + accType + ", accMobile=" + accMobile
				+ ", accEmail=" + accEmail + ", accAddr=" + accAddr + "]";
	}
}
