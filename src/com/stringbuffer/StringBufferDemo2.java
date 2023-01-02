package com.stringbuffer;

public class StringBufferDemo2 {
	public static void main(String[] args) {
		String s = new String("iei");
		String rev = new StringBuffer(s).reverse().toString();
		if (s.equals(rev)) {
			System.out.println(s + " is palindrome");
		} else {
			System.out.println(s + " is not palindrome");
		}

	}

}
