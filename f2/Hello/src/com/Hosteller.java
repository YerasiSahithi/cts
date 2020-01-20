package com;

public class Hosteller extends Students {
	public String hname;
	public int hno;

	public Hosteller(int id, int phoneno, String name, String course, String gender, String hname, int hno) {
		super(id, phoneno, name, course, gender);
		this.hname = hname;
		this.hno = hno;
		// TODO Auto-generated constructor stub
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	@Override
	public String toString() {
		return "Hosteller [hname=" + hname + ", hno=" + hno + ", getId()=" + getId() + ", getPhoneno()=" + getPhoneno()
				+ ", getName()=" + getName() + ", getCourse()=" + getCourse() + ", getGender()=" + getGender()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	
}
