package logical_programe;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		System.out.println("please enter string value");
//		String v=sc.next();
//		System.out.println("give the string "+v);
//	String	rev =" ";
//
//	
//	for(int i=v.length()-1;i>=0;i--) {
//		rev=rev+v.charAt(i);
//		//i=3 //=""+E-->E
//		//i=2 //E+N-->EN
//		//i=1 //EN+U-->ENU
//		//i=0 //ENU+P-->ENUP
//		//syso(rev
//	}
//	System.out.println("revrse string is "+rev);
//	
	
	
	
	
	
	
	
	
	
	Scanner sc= new Scanner(System.in);
	System.out.println("give the string");
	String vp=sc.next();

	String rev= "";

	for(int i=vp.length()-1;i>=0;i--){
	rev=rev+vp.charAt(i);
	}
	System.out.println("Revrse String is "+rev);System.out.println("actual string is "+vp);

if(vp.equals(rev)){
System.out.println("String is palindrom");}
else{System.out.println("String is not palindrom");}
	
	
	
	
	
	
	
	}
	
	

}
