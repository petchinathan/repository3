package com.classAndObjectDay2;

public class UseMarker {

	public static void main(String[] args) {
		Marker marker1 = new Marker();
		marker1.brand = "camlin";
		marker1.color = "Red";
		marker1.price = 50;
		marker1.isRefill = true;
		 
		Marker marker2 = new Marker();
		marker2.brand = "faber";
		marker2.color = "blue";
		marker2.price = 100;
		marker2.isRefill = false;
		
		System.out.println(marker1.brand+" "+marker1.color+" "+marker1.price+" "+marker1.isRefill);
		System.out.println("Brand="+marker2.brand+" "+"Price="+marker2.price+" "+"Color="+marker2.color+" "+"isRefill="+marker2.isRefill);
	}

}
