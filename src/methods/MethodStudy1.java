package methods;

public class MethodStudy1 {

	public static void main(String[] args) {
		
		
		add();//static method call from same class
		mul();
		sub();
	    
       Test1.div();
}
	
	private static void sub() {
		int a;//variable
		int b;
		a=25;//2.
		b=25;
		int sum;//3.
		sum=a-b;
		System.out.println("sum is "+sum);
			
		
		
		
		
	}

	public static void add() 
	{
	int a;
	int b;
	a=25;
	b=25;
	int sum;
	sum=a+b;
	System.out.println("sum is "+sum);
		
		
		
	}
	public static void mul() {
		
		int a;
		int b;
		a=25;
		b=25;
		int sum;
		sum=a*b;
		System.out.println("sum is "+sum);
			
		
		
	}
	
	}


