package com.tnsif.dayseven;

public class Student {
	int srn;
	String name;
	String college="reva";
	
	Student(int r, String n){
		srn=r;
		name=n;
		
	}
	void display() {
		System.out.println(srn+" "+name+" "+college);
	}
	public static void main(String args[]) {
		Student s1=new Student(21,"darshan");
		s1.display();
	}

	


}	