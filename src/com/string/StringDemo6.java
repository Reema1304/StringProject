package com.string;
//addition of digit in string using string class method//
public class StringDemo6 {
	public static void main(String[] args) {
		String s = "we2c05e 1o 7es71ng 5ha5tr2";
		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				result = result + s.charAt(i)-48;
			}

		}
		System.out.println("Addition: "+result);
	}
}
