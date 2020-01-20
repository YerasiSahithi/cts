package com;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle(1, "rectangle", 3, 4);
		System.out.println(r.calcArea());
		System.out.println(r);
		Circle ci= new Circle(1,"circle",4);
		System.out.println(ci.calcArea());
		System.out.println(ci);
		Square s = new Square(1, "square", 3);
		System.out.println(s.calcArea());
		System.out.println(s);
	}

}
