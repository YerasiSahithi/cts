package com;
abstract class AbstractClass
{
	abstract void add(int a,int b);
	void show()
	{
		System.out.println("abstract method");
	}
}
class Abst extends AbstractClass{

@Override
void add(int a, int b) {
System.out.println(a+b);
}
}
public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abst a=new Abst();
a.add(10, 9);
	}
}
	// TODO Auto-generated method stub
	

