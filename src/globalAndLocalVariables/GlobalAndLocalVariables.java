package globalAndLocalVariables;

public class GlobalAndLocalVariables {
	int a=10;// global variables non static
	int b=25;//global variables non static
	static int c=40;//Static global variables
	static int d=30;
	
	
	
	public void sum()//non static method
	{
		int  sum1=a+b;//non static variable
		int sum2=c+d;//static variable
		
		System.out.println("first addition is "+sum1);
		System.out.println("second addition is "+sum2);
		
		
		}
	
	public static void sub()//static method
	{//in static method we call just static variable we could not call non static method
		int sub1=c-d;//static variables
		
		
		System.out.println( "my subtraction "+sub1       );
		
		
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       sub();//calling static method
       GlobalAndLocalVariables g2=new GlobalAndLocalVariables();//create object foe non static method
       g2.sum();
	}

}
