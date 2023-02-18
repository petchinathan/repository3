package com.classAndObjectDay2;

public class UseMobile {

	public static void main(String[] args) {
		Mobile mobile1 = new Mobile();
		mobile1.brand = "Redmi";
		mobile1.color = "black";
		mobile1.isWarrenty = true;
		mobile1.price = 15000;
		mobile1.ram = 8;
		
		Mobile mobile2 = new Mobile();
		mobile2.brand = "Apple";
		mobile2.color = "White";
		mobile2.isWarrenty = true;
		mobile2.price = 50000;
		mobile2.ram = 8;
		
		Mobile mobile3 = new Mobile();
		mobile3.brand = "Oppo";
		mobile3.color = "blue";
		mobile3.isWarrenty = false;
		mobile3.price = 20000;
		mobile3.ram = 4;
		 
		System.out.println("Brand="+mobile1.brand+" "+"Price="+mobile1.price+" "+"Ram="+mobile1.ram);
		System.out.println("Brand="+mobile2.brand+" "+"Price="+mobile2.price+" "+"Ram="+mobile2.ram);
		System.out.println("Brand="+mobile3.brand+" "+"Price="+mobile3.price+" "+"Ram="+mobile3.ram);


	}

}
