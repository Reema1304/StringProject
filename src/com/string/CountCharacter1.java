package com.string;

import java.util.Map;
import java.util.TreeMap;

public class CountCharacter1 {
	public static void main(String[] args) {
		String s="I Love India";
		s=s.replace(" ", "");
		Map<Character,Integer>map=new TreeMap();
		for(int i=0;i<s.length();i++) {
			int count=0;
			for(int j=0;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			map.put(s.charAt(i), count);
		}
		System.out.println(map);
	}

}
