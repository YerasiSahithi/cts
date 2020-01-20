package com;

public class Shape {
	int shapeid;

	public Shape(int shapeid, String shapename) {
		super();
		this.shapeid = shapeid;
		this.shapename = shapename;
	}

	String shapename;

	public int getShapeid() {
		return shapeid;
	}

	public void setShapeid(int shapeid) {
		this.shapeid = shapeid;
	}

	public String getShapename() {
		return shapename;
	}

	public void setShapename(String shapename) {
		this.shapename = shapename;
	}

	void displayShape() {
		System.out.println(+shapeid + shapename);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape(1, "rect");
		s.displayShape();
	}
}
