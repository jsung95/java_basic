package myapp;

import lombok.extern.log4j.Log4j;


@Log4j
public class EnumExample {
	
	public static void main(String[] args) {
		
		Week today = Week.SATURDAY;
		
		log.info(today);
		log.info(today.ordinal());
		
		log.info(today.getName());
		log.info(today.getAge());
		
	} //main
	
} //end class

enum Week{
	MONDAY("NAME_1", 10),
	TUESDAY("NAME_2", 20),
	WEDNESDAY("NAME_3", 30),
	THURSDAY("NAME_4", 40),
	FRIDAY("NAME_5", 50),
	SATURDAY("NAME_6", 60),
	SUNDAY("NAME_7", 70);
	
	private Week() {
		System.out.println("Default constructor invoked.");
	} //default constructor
	
	private String name;
	private int age;

	private Week(String name, int age) {
		System.out.printf("constructor(%s, %d) invoked.\n", name, age);
		
		this.name = name;
		this.age = age;
	}// constructor
	
	public String getName() {
		System.out.println("getValue() invoked.");
		System.out.println("\t + this : " + this);
		System.out.println("\t + type : " + this.getClass().getName());
		
		return this.name;
	}// getName
	
	public int getAge() {
		System.out.println("getName() invoked.");
		System.out.println("\t + this : " + this);
		System.out.println("\t + type : " + this.getClass().getName());
		
		return this.age;
	}// getAge
	
}// end enum 
