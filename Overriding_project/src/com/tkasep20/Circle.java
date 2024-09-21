package com.tkasep20;

public class Circle extends Shape {

	private double radius;

	public Circle(double r) {

		this.radius = r;

	}
	
	@Override
	double area() {
		System.out.println(" Area of circle ");
		return Math.PI*radius*radius;
	}

}
