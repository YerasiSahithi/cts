package com;

	public class Circle extends Shape 

	{
		double radius;

		public Circle(int shapeid, String shapename, double radius) {
			super(shapeid, shapename);
			this.radius = radius;
		}

		public double getRadius() {
			return radius;
		}

		public void setRadius(double radius) {
			this.radius = radius;
		}

		@Override
		public String toString() {
			return "Circle [radius=" + radius + ", shapeid=" + shapeid + ", shapename=" + shapename + "]";
		}
		double calcArea()
		{
			double ar;
			ar=3.14*radius*radius;
			return ar;
		}

}
