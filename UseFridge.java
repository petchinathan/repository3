package com.classAndObjectDay2;

public class UseFridge {

	public static void main(String[] args) {
		Fridge fridge1 = new Fridge();
		fridge1.brand = "LG";
		fridge1.isDoubleDoor = true;
		fridge1.price = 45000;
		fridge1.taxPercentage = 10;
		fridge1.discountPercentage = 5;
		fridge1.taxAmount = fridge1.price*fridge1.taxPercentage/100;
		fridge1.discountAmount = fridge1.price*fridge1.discountPercentage/100;
		fridge1.netPrice = fridge1.price+fridge1.taxAmount-fridge1.discountAmount;
		
		Fridge fridge2 = new Fridge();
		fridge2.brand = "LG";
		fridge2.price = 55000;
		fridge2.taxPercentage = 10;
		fridge2.discountPercentage = 5;
		fridge2.taxAmount = fridge2.price*fridge2.taxPercentage/100;
		fridge2.discountAmount = fridge2.price*fridge2.discountPercentage/100;
		fridge2.netPrice = fridge2.price+fridge2.taxAmount-fridge2.discountAmount;
		
		System.out.println("Brand="+fridge1.brand+" NetPrice="+fridge1.netPrice);
		System.out.println("Brand="+fridge2.brand+" NetPrice="+fridge2.netPrice);

	}

}
