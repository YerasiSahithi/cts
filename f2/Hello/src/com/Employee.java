package com;
public class Employee {
	static int empid;
	static String empname;
	static String emploc;
	static int salary;
	Address address;
	public int id;
	public Employee(int empid, String empname, String emploc, int salary) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.emploc = emploc;
		this.salary = salary;
		//this.address=address;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmploc() {
		return emploc;
	}
	public void setEmploc(String emploc) {
		this.emploc = emploc;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e = new Employee(1,"sahithi","knl",1000);
System.out.println("salary is "+ salary + " \nid is "+ empid + " \nname is "+ empname +"\nlocation is "+ emploc);
	} 
}
