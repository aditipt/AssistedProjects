package org.java.constructors;

//UserDefined Constructor
public class Emp {
	
	int id;
	String name;

    void display() {
	System.out.println(id+" "+name);
	}
    
    
	
	public Emp(int id, String name) {
		
		this.id = id;
		this.name = name;
	}



	public static void main(String[] args) {
		
		Emp e1 = new Emp(102,"Ashwini");
		Emp e2 = new Emp(108,"Arya");
		
		e1.display();
		e2.display();
	}
}
