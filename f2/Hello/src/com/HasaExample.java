package com;
class Engine
{
	int engineNo,age;
	@Override
	public String toString() {
		return "Engine [engineNo=" + engineNo + ", age=" + age + ", fueltype=" + fueltype + "]";
	}
	String fueltype;
	
	public Engine(int engineNo, int age, String fueltype) {
		super();
		this.engineNo = engineNo;
		this.age = age;
		this.fueltype = fueltype;
	}
	
	public int getEngineNo() {
		return engineNo;
	}
	public void setEngineNo(int engineNo) {
		this.engineNo = engineNo;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	
}
class car2
{
	Engine e;
	@Override
	public String toString() {
		return "car2 [e=" + e + ", carno=" + carno + ", carmodel=" + carmodel + "]";
	}
	int carno;
	String carmodel;

	public car2(Engine e, int carno, String carmodel) {
		super();
		this.e = e;
		this.carno = carno;
		this.carmodel = carmodel;
	}
	
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public int getCarno() {
		return carno;
	}
	public void setCarno(int carno) {
		this.carno = carno;
	}
	public String getCarmodel() {
		return carmodel;
	}
	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}
		
}

public class HasaExample {
	public static void main(String args[]) {
		
	
car2 c=new car2(new Engine(101,102,"patrol"),1234,"maruti");
System.out.println(c);
	}
}