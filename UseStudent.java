package com.classAndObjectDay2;

public class UseStudent {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "Raj";
		s1.examNumber = 1011;
		s1.tamilMark = 78;
		s1.englishMark = 85;
		s1.mathsMark = 89;
		s1.physicsMark = 78;
		s1.chemistryMark = 85;
		s1.biologyMark = 97;
		s1.totalMark = s1.tamilMark+s1.englishMark+s1.physicsMark+s1.chemistryMark+s1.mathsMark+s1.biologyMark;
		s1.average = s1.totalMark/6;
		
		Student s2 = new Student();
		s2.name = "Kumar";
		s2.examNumber = 1022;
		s2.tamilMark = 88;
		s2.englishMark = 85;
		s2.mathsMark = 100;
		s2.physicsMark = 78;
		s2.chemistryMark = 85;
		s2.biologyMark = 100;
		s2.totalMark = s2.tamilMark+s2.englishMark+s2.physicsMark+s2.chemistryMark+s2.mathsMark+s2.biologyMark;
		s2.average = s2.totalMark/6;
		
		System.out.println("Name="+s1.name+" Totalmark="+s1.totalMark+" Average="+s1.average);
		System.out.println("Name="+s2.name+" Totalmark="+s2.totalMark+" Average="+s2.average);


	}

}
