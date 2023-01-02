package com.string;

public class ConsecutiveString {
	public static void main(String[] args) {
		String s = "Reema Hello";
		s = s.replace(" ", "");
		System.out.println("Length of string: " + s.length());
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j > i; j--) {
				if (s.charAt(i) == s.charAt(j)) {
					System.out.println(("" + s.charAt(i)).concat("" + s.charAt(j)) + " = true");
				} else {
					System.out.println(("" + s.charAt(i)).concat("" + s.charAt(j)) + " = false");
				}
			}
		}
	}

}
