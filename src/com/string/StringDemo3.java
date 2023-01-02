package com.string;

public class StringDemo3 {
	public static void main(String[] args) {
		String s = new String("TENET");
		String ss = new String("Testing");
		// int len=s.length();
		// System.out.println(len);
		System.out.println(s.length()); // length() method
		//ss.concat(" Shastra"); // concat() method
		ss=ss.concat(" Shastra");
		System.out.println(ss);
		StringBuffer sb = new StringBuffer(s);
		StringBuffer reverse = sb.reverse(); // reverse method is present in stringbuffer class not in string class
		String s1 = new String(reverse);
		if (s.equals(s1)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
		/*
		 String s=new String("NITIN");                                                        
		 String rev=new StringBuffer(s).reverse().toString(); 
		 if(s.equals(rev)) {
		 System.out.println("Palindrome"); }else {
		 System.out.println("not palindrome"); 
		 }
		 */
	}

}
