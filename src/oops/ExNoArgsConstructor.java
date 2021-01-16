package oops;

public class ExNoArgsConstructor {

	int stuId;
	String stuName;
	char gender;
	String color;
	
	ExNoArgsConstructor(){
		System.out.println("Hi,This is constructor.I can execute at the time of object creation");
		stuId = 10;
		stuName = "Venkatesh K";
		gender = 'M';
		color = "White";
	}
	
		
	public static void main(String args[]) {

		ExNoArgsConstructor venkatesh = new ExNoArgsConstructor();		


		System.out.println("Student Id is:" + venkatesh.stuId);
		System.out.println("Student name is:" + venkatesh.stuName);
		System.out.println("Student gender is:" + venkatesh.gender);
		System.out.println("Student color is:" + venkatesh.color);
		
		
		
		
	
	}

}