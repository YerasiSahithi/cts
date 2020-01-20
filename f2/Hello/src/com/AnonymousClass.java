package com;

abstract class Person
{
	abstract void eat();
}
public class AnonymousClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person()
				{
					void eat()
					{
						System.out.println("fruits");
					}
				};
				p.eat();

	}

}
