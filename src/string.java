

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	String s="Velocity";//constant pool area
	String s1="Velocity";
	String m=new String("Velocity");//non constant pool area
	String m1=new String ("Velocity");//
	
	
	//use length method
System.out.println("length of string is "+s.length());
	
//stored in reference variable for future use

	int stringLength = s1.length();
	System.out.println("length of string is "+stringLength);
	
	
	//using upper case
	
	String capitalvalueofm = m.toUpperCase();
	
	System.out.println("capital of string is "+capitalvalueofm);
	
	//using lower case
	  String lowercasem1 = m1.toLowerCase();
	  System.out.println("capital of string is "+lowercasem1 );
	  
	  //use of equal methods
	  
	  //== compare with memory location
	  
	  System.out.println(s1==s);// object creation without new keyword
	  
	  
	  System.out.println(s1==m);//one object is constant pool area and another object is non constant  pool area
	  
	  
	System.out.println(m==m1);//object with new keyword
	  //use of equal method
	
	System.out.println(m.equals(m1));//case sensitive
	System.out.println(m.equalsIgnoreCase(m1));//this is ignore case sensitivity and just compare content
	
	
	//use of contains ()method
	
      System.out.println(s.contains("cy"));//index  sequence is linear then boolean condition true other wise falls 
	
	//use of empty method
      
    System.out.println( m.isEmpty());

   //  System.out.println( n.isEmpty());java.lang.NullPointerException
    String m2="";
 System.out.println(  m2.isBlank());
    
    //use of charAt() Method
    
    String city="Kolhapur";
      System.out.println(city.charAt(3));
      System.out.println(city.charAt(0));
      
    // subtraction 
    System.out.println( m1.substring(4));
 System.out.println(   m1.substring(2, 6));
      
     //concat 
System.out.println( m1.concat(m));
  System.out.println(m1.concat("2"));
 
 //index of
  
System.out.println( m1.indexOf("y"));


//last index of
System.out.println( m.lastIndexOf("i"));


	}	

}
