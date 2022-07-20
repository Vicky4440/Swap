package constructor1;

public class Cs1 {
             int a;
             int b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Cs1 c1=new Cs1();
      c1.sum();
	}
      Cs1()// define constructor----->zero parameter/without parameter
      {
    	  a=22;
    	  b=223;
    	  
    	  System.out.println("Welcome to constructor");
    	  
    	  
    	  
    	  
      }
	public void sum()
	{
		int sum=a+b;
		System.out.println("My addition is "+sum);
		
		
		
	}
	
	
	
}
