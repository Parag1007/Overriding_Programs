package com.tkasep20;

public class Ractangle extends Shape {

	private double len;
	private double width;

	public Ractangle(double len, double width) {
		this.len = len;
		this.width = width;

	}

	// @Override
	double area() {
		System.out.println(" Area of Ractangle:  ");
		return len * width;

	}

}
