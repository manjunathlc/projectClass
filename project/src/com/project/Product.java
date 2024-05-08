package com.project;

//java bean class
// constructors with zero argument and with full argument
public class Product {
	private int pid;
	private String pname;
	private double pprice;
	private String company;
	private int qty;
	
	public Product() {
		
	}
	public Product(int pid, String pname, double pprice, String company, int qty) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pprice = pprice;
		this.company = company;
		this.qty = qty;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPprice() {
		return pprice;
	}

	public void setPprice(double pprice) {
		this.pprice = pprice;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
}
