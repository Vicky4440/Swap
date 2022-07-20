package arrys;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name="VIkram";
		        String[] arr = name.split("");
		 for ( int i=arr.length-1;i>=0; i--) {
			 
			System.out.println(arr[i]); 
			 
			 
		 }
		 
		 String name1="VIkram_nalawade";
	        String[] arr1 = name1.split("_");
	 for ( int i=arr1.length-1;i>=0;i--) {
		 
		System.out.println(arr1[i]); 
		 
		
	 }
	
	 String name2="VIkram";
	   String reverse=" ";
	   for(int i=0;i<name2.length()-1;i++) {
	   char ch=name2.charAt(i);
	  
	reverse=ch+ reverse;
	
	  System.out.println(reverse);}
		   
		   String n="123456infosys";
		   
	    String reverse1=" ";
	    
	 for(int i=6; i<n.length()-1;i++) {
		 
		char ch=n.charAt(i) ;
		 reverse1= ch+reverse1;}
		 System.out.println(reverse1);
	 }
	 
	
	}


