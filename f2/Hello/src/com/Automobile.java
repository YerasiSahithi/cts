package com;
class Car
{
	int carnum;
	int run()
	{
		return 60;
}
}

class Fordcar extends Car
{
	int run()
	{
		return super.run()+40;
	}
}

public class Automobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Fordcar f= new Fordcar();
f.run();
System.out.println(f.run());
	}
}


