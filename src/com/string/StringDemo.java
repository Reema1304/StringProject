package com.string;

/* String is sequence of character
 * String is a non-primitive datatype
 * String is class in java
 * String class object is immutable
 * immutable object cannot be change or deleted once it is initialized,if we try to change them then new object with new value will
   create in the memory
 * String object can be created by two ways:using literal and new keyword
 * All String object store in either heap memory or string constant pool(scp)
 * String constant pool is special type of memory which is dedicated to store string object only
 * String constant pool object is not allowed for garbage collection they will remain in the memory untill the life of program
 * object creation in SCP is optional,if value id already present in the SCP then new value will not get created instead
   reference of old value given to 
 * SCP doesnt allow duplicate values
 *  */
public class StringDemo {
	public static void main(String[] args) {
		String s = "Hello"; //object created using literal
		s = "Hi";
		System.out.println(s);
		String s1 = "Testing";
		int ch=s1.indexOf('i');
		System.out.println(ch);
		// String s2=s1.concat("Shastra");
		s1.concat("Shastra");
		s1 = s1.concat("Shastra");
		System.out.println(s1);
		// System.out.println(s2);
	}

}
