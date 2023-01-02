package com.stringbuffer;

public class ReverseString {
	public void reverseString() {
		String s=new String("TENET");
		StringBuffer sb=new StringBuffer(s);
		StringBuffer rev=sb.reverse();
		String s1=new String(rev);
		if(s.equals(s1)) {
			System.out.println("Palindrome String");
		}else {
			System.out.println("Not Palindrome String");
		}

	}
	public static void main(String[] args) {
		ReverseString rs=new ReverseString();
		rs.reverseString();
	}

}
