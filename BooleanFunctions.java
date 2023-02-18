package com.stringDay3;

public class BooleanFunctions {

	public static void main(String[] args) {
		String name = "petchinathan";
		boolean check = name.contains("nathan");
		System.out.println(check);
		
		boolean check1 = name.startsWith("p");
		System.out.println(check1);
		
		boolean check2 = name.endsWith("n");
		System.out.println(check2);
		
		boolean check3 = name.equals("petchinathan");
		System.out.println(check3);
		
		boolean check4 = name.equalsIgnoreCase("PETCHINATHAN");
		System.out.println(check4);
		
		

	}

}
