package com.string;

public class StringDemo4 {
	public static void main(String[] args) {
		String s = new String("Testing Shastra");
		s = s.split("st")[1];
		System.out.println(s);
		String ss = new String("i love My India");
		String[] parts=ss.split("My");
		System.out.println(parts.length);
		//System.out.println(ss.split(" ").length);
		System.out.println(ss.split("My")[0]);
		System.out.println(ss.toUpperCase());
		System.out.println(ss.toLowerCase());
		System.out.println(ss.charAt(14));
		String ch=""+(ss.charAt(0));    //"" empty string
		System.out.println(ch.toUpperCase());	
		System.out.println(ss.replace('i', 'I'));
		System.out.println(ss.substring(0, 1).toUpperCase()+ss.substring(1));
		System.out.print(ch.toUpperCase()+ss.substring(1));
		System.out.println();
		String s1="Reema";
		String s2="Reema";
		if(s1==s2) {
			System.out.println("memory address are same");
		}else {
			System.out.println("memory adress is different");
		}
		if(s1.equals("Reema")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		if(s1.equalsIgnoreCase("rEeMa")){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		
	}

}