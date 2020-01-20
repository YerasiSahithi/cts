package com;

class AirAutomobile implements Fly,Runnable
{
	//double speed=100;
	String modelNo;
	void setModelNo(String modelNo)
	{
		this.modelNo=modelNo;
		
	}
	
	String show()
	{
		return modelNo;
	}

	@Override
	public int fly(int a) {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public int runnable(int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}
	interface Fly
	{
		int maxspeed=100;
		int fly(int a);
	}
	interface Runnable
	{
		int speed=50;
		int runnable(int b);
	}


public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AirAutomobile a= new AirAutomobile();
a.setModelNo("Air Bus");
System.out.println(a.show());
System.out.println(a.fly(90));
System.out.println(Fly.maxspeed);

	}

}
