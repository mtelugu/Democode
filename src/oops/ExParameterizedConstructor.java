package oops;

public class ExParameterizedConstructor {

	int stuId;
	String stuName;
	char gender;
	String color;
	
	ExParameterizedConstructor(int stuId,String stuName,char gender,String color){
		
		this.stuId = stuId;
		this.stuName = stuName;
		this.gender = gender;
		this.color = color;
	}
	
		
	public static void main(String args[]) {

		ExParameterizedConstructor venkatesh = new ExParameterizedConstructor(10,"Venkatesh K",'M',"White");		


		System.out.println("Student Id is:" + venkatesh.stuId);
		System.out.println("Student name is:" + venkatesh.stuName);
		System.out.println("Student gender is:" + venkatesh.gender);
		System.out.println("Student color is:" + venkatesh.color);
		
		ExParameterizedConstructor  mounika= new ExParameterizedConstructor(20,"Mounika",'F',"Pink");		


		System.out.println("Student Id is:" + mounika.stuId);
		System.out.println("Student name is:" + mounika.stuName);
		System.out.println("Student gender is:" + mounika.gender);
		System.out.println("Student color is:" + mounika.color);
		
		
		
		
	
	}

}