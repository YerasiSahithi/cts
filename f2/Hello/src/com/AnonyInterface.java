package com;
interface Eatable
{
	void eat();
}



public class AnonyInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eatable e = new Eatable()
				{
			public void eat()
			{
				System.out.println("eat");
			}
				};
		
e.eat();
	}

}
