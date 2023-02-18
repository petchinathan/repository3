package com.classAndObjectDay2;

public class UseBike {

	public static void main(String[] args) {
		Bike bike1 = new Bike();
		bike1.brand = "Yamaha";
		bike1.color = "red";
		bike1.cc = 150;
		bike1.taxpercentage = 18;
		bike1.price = 150000;
		bike1.netPrice = bike1.price+(bike1.price*bike1.taxpercentage)/100;
		
		
		Bike bike2 = new Bike();
		bike2.brand = "Honda";
		bike2.color = "black";
		bike2.cc = 160;
		bike2.taxpercentage = 18;
		bike2.price = 180000;
		bike2.netPrice = bike2.price+(bike2.price*bike2.taxpercentage)/100;
		
		System.out.println("Brand="+bike1.brand+" netprice="+bike1.netPrice);
		System.out.println("Brand="+bike2.brand+" netprice="+bike2.netPrice);
   }

}
