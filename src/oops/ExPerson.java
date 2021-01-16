package oops;

public class ExPerson {

	int stuId;
	String stuName;
	char gender;
	String color;
	
		
	public static void main(String args[]) {

		ExPerson venkatesh = new ExPerson();
		
		venkatesh.stuId=10;
		venkatesh.stuName="Venkatesh K";
		venkatesh.gender='M';
		venkatesh.color="White";

		System.out.println("Student Id is:" + venkatesh.stuId);
		System.out.println("Student name is:" + venkatesh.stuName);
		System.out.println("Student gender is:" + venkatesh.gender);
		System.out.println("Student color is:" + venkatesh.color);
		
		
		ExPerson varun = new ExPerson();
		
		varun.stuId=20;
		varun.stuName="Varun P";
		varun.gender='M';
		varun.color="White";

		System.out.println("Student Id is:" + varun.stuId);
		System.out.println("Student name is:" + varun.stuName);
		System.out.println("Student gender is:" + varun.gender);
		System.out.println("Student color is:" + varun.color);

	}

}