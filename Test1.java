package com.stringDay3;

public class Test1 {

	public static void main(String[] args) {
		String firstName = "Ram";
		String lastName = "Kumar";
		String join = firstName.concat(lastName).toUpperCase();
		int length = join.length();
		System.out.println(join);
		System.out.println("length is:"+length);

	}

}
