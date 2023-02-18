package com.stringDay3;

public class ToFindCharacter {

	public static void main(String[] args) {
		String name = "petchinathan";
		//int length = name.length();
		char find = name.charAt(name.length()-1);
		System.out.println(find);
		
		int position = name.indexOf('i');
		System.out.println(position);
		
		String lastName = name.substring(0,6);
		System.out.println(lastName);

		String input = "dog-cat-dove";
		String check[] = input.split("-");
		for(int i=0;i<check.length;i++) {
			System.out.println(check[i].toUpperCase());
		}
		
	    char[] result = name.toCharArray();
	    for(int i=0;i<result.length;i++) {
	    	System.out.print(result[i]+" ");
	    }
		
	}

}
