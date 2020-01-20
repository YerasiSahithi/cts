package com;

public class MemberInnerclass {
	private int data=30;

class Inner
{
	void msg()
	{
System.out.println("data is " + data);
		// TODO Auto-generated method stub

	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MemberInnerclass m= new MemberInnerclass();
MemberInnerclass.Inner i= new MemberInnerclass().new Inner();
i.msg();
	}

}
