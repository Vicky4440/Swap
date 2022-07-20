package globalAndlocalVariable;

public class FromSameClassCalling {
        int a=20;//non static global variable
        int b=15;
        static int c=36;//static global variable
        static int d=48;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FromSameClassCalling f2=new FromSameClassCalling();
		f2.mul();
		System.out.println(f2.a);//calling non static global variable from same class
        int sum= 125*f2.a;
        System.out.println("My Sum is"+sum);
        System.out.println("My static value "+d);//calling static global variable from same class
        int sum1=c+d;
        System.out.println("My sum is "+sum1);
        
        
        // call static method from another class
        sample.sub();
        // calling non static method from another class
        sample s2=new sample();
        s2.disp();
        		
        //calling static global variable from another class		
        
      System.out.println("value of f is "+sample.f);
     
        
        int sub3=sample.f;
        System.out.println("my sub3 value is "+sub3);
        
        //calling non static global variable from another class
        System.out.println("value of e is "+s2.e);
        int sub4=s2.e-sample.f;
        System.out.println("My sub4 value is "+sub4);
        
	}

	
	public void mul()
	{
		int multification=a*c;
		int multification1=b*d;
		System.out.println("First output "+multification);
		System.out.println("Second output "+multification1);
		
		
		
	}
	
	
	
	
}
