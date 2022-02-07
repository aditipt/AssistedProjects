package org.java.constructors;

public class Employee {

	int id;
	String name;

  void display() {
	System.out.println(id+" "+name);
	}


public static void main(String[] args) {

	Employee emp1=new Employee();
	Employee emp2=new Employee();

	emp1.display();
	emp2.display();
	}

}
