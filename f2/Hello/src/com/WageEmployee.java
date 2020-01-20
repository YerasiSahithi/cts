package com;

public class WageEmployee extends Employee {
	int number;
	int hours;

	public WageEmployee(int empid, String empname, String emploc, int salary, int number, int hours) {
		super(empid, empname, emploc, salary);
		this.number = number;
		this.hours = hours;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	@Override
	public String toString() {
		return "WageEmployee [number=" + number + ", hours=" + hours + ", getEmpid()=" + getEmpid() + ", getEmpname()="
				+ getEmpname() + ", getEmploc()=" + getEmploc() + ", getSalary()=" + getSalary() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	int calculatesal() {
		// int totsal;
		// totsal=salary*hours;
		return getSalary() * hours;
	}

}
