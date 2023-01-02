package com.stringbuffer;
/* StringBuffer is class in java
 * Stringbuffer class final in java
 * if there is a need of frequent modification in the string object that time it is not recommended to use string class 
   that time we can use stringbuffer class
 * stringbuffer class object is mutable in java 
 * mutable object can be changed once it is initialized.modification are done in existing value new value will not get created
 * stringbuffer object can be created using new keyword only
 * stringbuffer object will store in the heap memory so duplicates are allowed in heap memory.
 * and from below example object sb and sb1 have different memory address.
 * All methods of stringbuffer class is synchronized.
 * */
public class StringBufferDemo {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		sb.append(" Welcome to Testing Shastra"); // o/p:Hello Welcome to testing Shastra 
		//sb.append(" Welcome to Testing Shastra");  // o/p:Hello Welcome to testing Shastra
		System.out.println(sb);
		StringBuffer sb1=new StringBuffer("Hello");
		if(sb==sb1) {
			System.out.println("memory address are same");
		}else {
			System.out.println("memory address are different");
		}
	}

}
