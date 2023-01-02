package com.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//addition of digit in string without using string class method by using Regular Expression//
public class StringDemo7 {
	public static void main(String[] args) {
		System.out.println("\"Hello\""); //  \ is a escape character
		System.out.println("\"My name is Reema Teltumbade\"");
		System.out.println("\"Prakash is my husband\"");
		String s = "we2c05e 1o 7es71ng 5ha5tr2";
		int sum=0;
		Pattern p=Pattern.compile("\\d");
		Matcher m=p.matcher(s);
		while(m.find()) {
			sum=sum+Integer.parseInt(m.group());
		}
		System.out.println("Addition: "+sum);
		additionOfDigit();
	}
	
	public static void additionOfDigit() {
		String abc="2rte47h85ong50p6b";
		int result=0;
		Pattern p=Pattern.compile("\\d");
		Matcher m=p.matcher(abc);
		while(m.find()) {
			result=result+Integer.parseInt(m.group());
		}
		System.out.println("Addition of digit: "+result);

	}

}
