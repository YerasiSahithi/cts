package com;

public class Rectangle extends Shape {
	int length;

	public Rectangle(int shapeid, String shapename, int length, int breadth) {
		super(shapeid, shapename);
		this.length = length;
		this.breadth = breadth;
	}

	int breadth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", breadth=" + breadth + ", shapeid=" + shapeid + ", shapename="
				+ shapename + "]";
	}

	int calcArea() {
		int area;
		area = length * breadth;
		return area;

	}

	}
