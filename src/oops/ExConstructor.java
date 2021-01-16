package oops;

public class ExConstructor {

	int stuId = 10;
	String stuName = "Venkatesh K";
	char gender = 'M';
	String color = "White";
	
	
		
	public static void main(String args[]) {

		ExConstructor venkatesh = new ExConstructor();		


		System.out.println("Student Id is:" + venkatesh.stuId);
		System.out.println("Student name is:" + venkatesh.stuName);
		System.out.println("Student gender is:" + venkatesh.gender);
		System.out.println("Student color is:" + venkatesh.color);
		
	
	}

}