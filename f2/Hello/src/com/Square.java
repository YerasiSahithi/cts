package com;

public class Square extends Shape {
	int length;

	public Square(int shapeid, String shapename, int length) {
		super(shapeid, shapename);
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Square [length=" + length + ", shapeid=" + shapeid + ", shapename=" + shapename + "]";
	}
	int calcArea() {
		int area;
		area = length *length;
		return area;

	}

}
