package com.string;

public class StringDemo2 {
	public static void main(String[] args) {
		String s=new String(); // empty constructor
		System.out.println(s);
		String s1=new String("Hello"); //parametarized constructor
		System.out.println(s1);
		char[] ch= {'T','e','s','t','i','n','g',' ','S','h','a','s','t','r','a'};
		String s2=new String(ch);
		System.out.println(s2);
		String s3=new String(ch,8,7); //offset-8-Starting index count-7-size/length of subarray
		System.out.println(s3);
		
		
		
	}

}
