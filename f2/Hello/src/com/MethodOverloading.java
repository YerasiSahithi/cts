package com;
class Addition
{
	int add(int a,int b)
	{
		return a+b;
	}
	double add(double a,int b)
	{
		return a+b;
	}
	double add(int a,double b)
	{
		return a+b;
}
	
}
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Addition a=new Addition();
System.out.println(a.add(10, 10));
System.out.println(a.add(10.6, 8));
System.out.println(a.add(10.5, 5));

	}

}
