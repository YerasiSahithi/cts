package com;
class InvalidAmountException extends Exception
{
InvalidAmountException(String s)
{
	super(s);
}
}
public class CustomExample {
static void validate(int minbalance)throws InvalidAmountException {
	if(minbalance<1000)
	{
		throw new InvalidAmountException("not valid");
		
	}
	else 
	{
		System.out.println("valid");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	validate(100);
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}
