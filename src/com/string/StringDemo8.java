package com.string;

import java.util.Scanner;

public class StringDemo8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.nextLine();
		// System.out.println(name);
		int spacecount = 0;
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == ' ') {
				spacecount++;
			}
		}
		if (spacecount > 1) {
			System.out.println("is not a valid string");
		} else if (name.contains("0") || name.contains("1") || name.contains("2") || name.contains("3")
				|| name.contains("4") || name.contains("5") || name.contains("6") || name.contains("7")
				|| name.contains("8") || name.contains("9")) {
			String[] arr1 = name.split(" ");
			// System.out.println("arr1[0]:"+arr1[0].charAt(0));
			// System.out.println("arr1[1]:"+arr1[1].charAt(0));
			for(int i=0;i<arr1.length;i++) {
			if ((arr1[0].charAt(i) >= '0' && arr1[0].charAt(i) <= '9')
					&& (arr1[1].charAt(i) >= '0' && arr1[1].charAt(i) <= '9')) {
				System.out.println("is not a valid string");
				break;

			} else if(((arr1[0].charAt(i)>='0'&& arr1[0].charAt(i)<='9')&&(arr1[0].charAt(i)>='a'&& arr1[0].charAt(i)<='z'))||
					  ((arr1[1].charAt(i)>='0'&& arr1[1].charAt(i)<='9')&&(arr1[1].charAt(i)>='a'&& arr1[1].charAt(i)<='z'))){
				System.out.println("is not a valid String");
				break;
				
			}else if ((arr1[0].charAt(i) >= 'a' && arr1[0].charAt(i) <= 'z')
					&& (arr1[1].charAt(i) >= '0' && arr1[1].charAt(i) <= '9')) {
				System.out.println("first name is valid second name is not valid");
				break;

			} else if ((arr1[0].charAt(i) >= '0' && arr1[0].charAt(i) <= '9')
					&& (arr1[1].charAt(i) >= 'a' && arr1[1].charAt(i) <= 'z')) {
				System.out.println("first name is not valid second name is valid");
				break;

			}
		}

		} else {
			System.out.println("String is valid");
			//String[] arr = name.split(" ");
			String temp=name.substring(0,1).toUpperCase()+name.substring(1);
			
//			for (int i = 0; i < arr.length; i++) {
//				String temp = ("" + arr[i].charAt(0)).toUpperCase() + arr[i].substring(1);
//				System.out.print(temp + " ");
//			}
			System.out.println(temp);
		}

	}
}
