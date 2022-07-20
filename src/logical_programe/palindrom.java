package logical_programe;

import java.util.Scanner;

public class palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc=new Scanner(System.in);
 System.out.println("give the string");
 
 String vp=sc.next();
 System.out.println("string value "+vp);
 String rev="";
 for(int i=vp.length()-1;i>=0;i--) {
	 rev=rev+vp.charAt(i);
	 
	 
 }
 System.out.println("orginal string is "+vp);
 System.out.println("revrse string is "+rev);
 
 
 if(vp.equals(rev)) {
	 System.out.println("string is in palindrome");
 }
 else {
	 System.out.println("string is not palindrome");
 }
	}

}
