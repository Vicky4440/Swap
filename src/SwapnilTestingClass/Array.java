package SwapnilTestingClass;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		
		
		
		
		
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
int size;
		Scanner sc=new Scanner(System.in);
System.out.println("enter size of array");
	size=sc.nextInt();
	System.out.println("Size of array "+size);
	int a[]=new int[size];
	for(int i=0; i<size; i++) {
		a[i]=sc.nextInt();
		
	}
		    System.out.println("array elements are ");  
		    for(int i=0; i<size;i++) {
		    	System.out.println(a[i]+" ");
		    }
//		    
		    
		    
	}

}



