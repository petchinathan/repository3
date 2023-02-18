package com.stringDay3;

public class RegexPrograms {

	public static void main(String[] args) {
		String name = "petchi     nathan";
		String split[] = name.split("//s");
		for(int i=0;i<split.length;i++) {
			System.out.print(split[i]);
		}
		
		String name1 = "raj1233545Kumar";
		String split1[] = name1.split("\\d+");
		for(int i=0;i<split1.length;i++) {
			System.out.print(split1[i]);
		}
		
		String name2 = "petchi12345";
		String split2[] = name2.split("[a-z]");
		for(int i=0;i<split2.length;i++) {
			System.out.print(split2 [i]);
		}
	}

}
