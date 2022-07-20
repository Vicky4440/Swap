package methods;

public class NonStaticMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonStaticMethods n=new NonStaticMethods();//created object from same class
		n.myMethod();//calling method from same class
		Test2 t2= new Test2();
		t2.method1();
		NonStaticMethods r=new NonStaticMethods();
		r.rollno();
		Test2 t3=new Test2();
		t3.method2();
		show();
		NonStaticMethods d1= new NonStaticMethods();
		d1.display();
		Test2 t4= new Test2();
		t4.method3();
			
	}
    public static void show()
{
	String name="samu";
	
   System.out.println("My Name IS "+name);


}
	public void display()
	{
		String name1="dipu";
		 System.out.println("My Name IS "+name1);
		
	}
	
	
	public void myMethod()
	{
		int a;
		int c;
		a=252;
		c=328;
		int sum ;
		sum= a+c;
		System.out.println("sum is "+sum);
		}
	
	public void rollno()
	{
		
	    int a=25;
	    int b=21;
	    int sum=a+b;
	System.out.println("total studnet "+sum);
	    
	    }
	
	
	
	
	
	
}
