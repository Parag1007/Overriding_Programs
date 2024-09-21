package com.tkasep20;

public class Test {
	public static void main(String[] args) {

		Ractangle r = new Ractangle(12, 11);
		double result1 = r.area();
		System.out.println(result1);
		Circle c = new Circle(2);
		double result2 = c.area();
		System.out.println(result2);

	}

}
