package com;


public class LocalInnerClass {

	private int data=70;
	void display()
	{
		 class Local{
			void msg()
			{
				System.out.println(data);
			}
		 }
			Local l= new Local();
			l.msg();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInnerClass obj= new LocalInnerClass();
obj.display();
	}

}
