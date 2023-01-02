package com.string;
/*Object creation in SCP is optional,if value is already present in the memory then new value will not get created instead
  of that reference of old value given to new value
 *whenever the request for the new object generated then JVM checks whether the same value is already present in SCP or not 
   if same value is present then the ref of old value given to new value otherwise new object with new value will  get created
   in SCP 
 *SCP doesnt allow dupilcate object
 *String s="Testing shastra---object created using literal---here s point to a value in scp---only one object will get created in scp" 
 *String s=new String("Testing shastra")---object created using new keyword----here s point to a value in heap memory
 * and scp value remain unreffered-----in this case two object get created one in heap memory and other in scp*/
public class StringDemo1 {
	public static void main(String[] args) {
		String s1="Testing Shastra";
		String s2="Testing Shastra";
		if(s1==s2) {  //if == operator use with object then it will compare the memory addresses.
			System.out.println("memory address are same");
		}else { 
			System.out.println("memory address are different");// output will be mem address are same
		}
		/*String s1=new String("Hello"); 
		String s2=new String("Hello");
		if(s1==s2) {
			System.out.println("memory address are same");
		}else {
			System.out.println("memory address are different"); //output will be mem address are diff
		}*/
	}

}
