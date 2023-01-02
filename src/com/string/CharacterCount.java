package com.string;

import java.util.Hashtable;

public class CharacterCount {
	public static void main(String[] args) {
		String s = "I Lovee Indiaaaaa love Imy";
		s = s.replace(" ", "");
		Hashtable<Character,Integer> ht = new Hashtable<Character,Integer>();
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			ht.put(s.charAt(i), count);
			
		}
		System.out.println(ht);
		keyValuePair();
	
	}
	public static void keyValuePair() {
		String s="Reema Prakash Gawali";
		s=s.replace(" ", "");
		Hashtable<Character,Integer> ht=new Hashtable<Character,Integer>();
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)){
					count++;
				}
			}
			ht.put(s.charAt(i),count);
		}
	    System.out.println(ht);
	}
}
