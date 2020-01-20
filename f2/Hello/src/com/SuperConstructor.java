package com;
 class AB
{
	AB()
{
	System.out.println("AB()");
}
}
	class B extends AB
	{
		B()
		{
			System.out.println("B()");
		}
	}

public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB a =new AB();
		B b=new B();

	}

}

