package com.classAndObjectDay2;

public class UseShirt {

	public static void main(String[] args) {
		Shirt shirt1 = new Shirt();
		shirt1.brand = "Levis";
		shirt1.color = "red";
		shirt1.price = 1000;
		shirt1.size = 43;
		shirt1.discountPercentage = 10;
		shirt1.isChecked = true;
		shirt1.netPrice = shirt1.price-(shirt1.price*shirt1.discountPercentage)/100;
		
		Shirt shirt2 = new Shirt();
		shirt2.brand = "otto";
		shirt2.color = "blue";
		shirt2.price = 2000;
		shirt2.isChecked = true;
		shirt2.size = 55;
		shirt2.discountPercentage = 20;
		shirt2.netPrice = shirt2.price-(shirt2.price*shirt2.discountPercentage)/100;
		
		System.out.println("Brand="+shirt1.brand+" NetPrice="+shirt1.netPrice);
		System.out.println("Brand="+shirt2.brand+" NetPrice="+shirt2.netPrice);


	}

}
