package com.string;
/*if we want to represent any object as a string then we can use toString() method
 * toString() method returns the String representation of object
 * if we print any object then java compiler internally calls toString() method and gives hashcode of obj as output
   but if we override toString method then we get desired output of obj in string form'
 * Advantage:by overriding the toString() method of object class,we can return value of object instead of hashcode
 * */
public class ToStringDemo {
	String name;
	int rollno;
	String city;
	String bloodgrp;

	public ToStringDemo(String name, int rollno, String city, String bloodgrp) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.city = city;
		this.bloodgrp = bloodgrp;
	}
	public String toString() {     
		return name+" "+rollno+" "+city+" "+bloodgrp;
	}
	public static void main(String[] args) {
		ToStringDemo tt=new ToStringDemo("Reema",101,"Hinganghat","O+");
		ToStringDemo tt1=new ToStringDemo("Prakash",102,"Pune","AB+");
		//System.out.println(tt.name+" "+tt.rollno+" "+tt.city+" "+tt.bloodgrp);
		//System.out.println(tt1.name+" "+tt1.rollno+" "+tt1.city+" "+tt1.bloodgrp);
		System.out.println(tt); 
		System.out.println(tt1);
	}

}
