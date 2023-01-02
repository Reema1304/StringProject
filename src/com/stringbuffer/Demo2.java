package com.stringbuffer;

public class Demo2 {
	public static void main(String[] args) {
		String s="r345y76bg";
		int result=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				result=result+s.charAt(i)-48;
			}
		}
		System.out.println("sum : "+result);
	}

}
