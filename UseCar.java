package com.classAndObjectDay2;

public class UseCar {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.brand = "BMW";
		car1.isTubeLess = true;
		car1.price = 5000000;
		car1.taxAmount = 20000;
		car1.netPrice = car1.price+car1.taxAmount;
		
		Car car2 = new Car();
		car2.brand = "Audi";
		car2.isTubeLess = true;
		car2.price = 4500000;
		car2.taxAmount = 15000;
		car2.netPrice = car2.price+car2.taxAmount;
		
		System.out.println("Brand="+car1.brand+" NetPrice="+car1.netPrice);
		System.out.println("Brand="+car2.brand+" NetPrice="+car2.netPrice);
	}

}
