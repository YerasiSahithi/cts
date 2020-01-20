package com;

public class VraiableArgs {

	static void Add(int...values)
	{
		System.out.println("add method");
	int sum=0;
	for(int i:values)
	{
		sum=sum+i;
		System.out.println(sum);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Add(1,2);
Add(1,2,3,4);

	}

}
