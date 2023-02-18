package com.stringDay3;

public class Test2 {

	public static void main(String[] args) {
		String input ="Welcome/to/my/world";
		String[] split = input.split("/");
		String join = split[2].concat(split[3]);
		System.out.println(join.toUpperCase());
		
		String split1 = join.substring(2,join.length());
		System.out.println("length of world is:"+split1.length());
		
		String input1 = split[0];
		String split2 = input1.substring(1,input1.length()-1);
		System.out.println(split2);
		
		char input2 = input1.charAt(input1.length()-1);
		System.out.println("last letter of welcome is:"+input2);
		
		int length = split.length; 
		System.out.println("Array length is:"+length);

	}

}
