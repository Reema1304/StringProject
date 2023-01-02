package com.string;

public class GetChars {
	public static void main(String[] args) {
		String s="Reema Prakash";
		char ch[]=new char[s.length()];
		s.getChars(6, 11, ch, 3);
		System.out.println(ch);
	}

}
