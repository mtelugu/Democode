package oops;

public class ExConstructorOverloading {

	int stuId;
	String stuName;
	char gender;
	String color;

	ExConstructorOverloading() {
		System.out.println("Hi,This is No args constructor");

	}

	ExConstructorOverloading(int stuId, String stuName, char gender, String color) {
		System.out.println("Hi,This is Parametrized constructor");
		this.stuId = stuId;
		this.stuName = stuName;
		this.gender = gender;
		this.color = color;
	}

	public static void main(String args[]) {

		ExConstructorOverloading obj = new ExConstructorOverloading();
		ExConstructorOverloading obj1 = new ExConstructorOverloading();
		ExConstructorOverloading obj2 = new ExConstructorOverloading();

		ExConstructorOverloading venkatesh = new ExConstructorOverloading(10, "Venkatesh K", 'M', "White");

		System.out.println("Student Id is:" + venkatesh.stuId);
		System.out.println("Student name is:" + venkatesh.stuName);
		System.out.println("Student gender is:" + venkatesh.gender);
		System.out.println("Student color is:" + venkatesh.color);

	}

}