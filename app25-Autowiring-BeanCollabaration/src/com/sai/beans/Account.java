package com.sai.beans;

public class Account {

	private String accno;
	private String type;
	private String ifc;

	public String getAccno() {
		return accno;
	}

	public void setAccno(String accno) {
		this.accno = accno;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIfc() {
		return ifc;
	}

	public void setIfc(String ifc) {
		this.ifc = ifc;
	}

	@Override
	public String toString() {
		return "Account [accno=" + accno + ", type=" + type + ", ifc=" + ifc + "]";
	}
	
	

}
