
package com.string;
//WAP to print first character of each word as capital//
public class StringDemo5 {
	public static void main(String[] args) {
		/*String s = new String("i love my india");
		String[] parts = s.split(" ");
		for (int i = 0; i < parts.length; i++) {
			char ch = parts[i].charAt(0);
			// System.out.println(ch);
			String s2 = "" + ch;
			s2 = s2.toUpperCase() + parts[i].substring(1);
			System.out.print(s2 + " ");
		}*/
		String s="    welcome to testing shastra   ";
		//System.out.println(s);
		s=s.trim(); //trim() method
		String[] words=s.split(" ");
		
		for(int i=0;i<words.length;i++) {
			String s1=(""+words[i].charAt(0)).toUpperCase()+words[i].substring(1);//"" is a empty string 
			System.out.print(s1+" ");
			
		}
		System.out.println();
		System.out.println(s.indexOf('t'));   //indexOf() method
		System.out.println(s.lastIndexOf('t'));//lastIndexOf() method
		String ss="";    // "" empty String  //" " space is also a character so string is not empty
		System.out.println(ss.isEmpty());
		if(ss.isEmpty()) {    //isEmpty() method
			System.out.println("String is empty");
		}else {
			System.out.println("String is not empty");
		}
		boolean b1=s.startsWith("wel"); //startsWith() method
		System.out.println(b1);
		boolean b2=s.startsWith("o test", 9); //startsWith(prefix,offset) method 
		System.out.println(b2);
	}
}
