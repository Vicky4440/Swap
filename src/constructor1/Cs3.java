package constructor1;

public class Cs3 {
      int a;
      int b;
      int c;
      
      float e;
      float f;
     
     public  Cs3()// without parameter
      {
    	a=12;
    	b=23;
    	c=21;
    	 
     }
	public Cs3(int x)//single parameter
	{
	a=x;
	
	}
	public Cs3 (int x,int y)//double parameter
	{
		a=x;
		b=y;
		
	}
	public Cs3(int x, int y, int z, float v, float n)
	{
		a=x;
		b=y;
		c=z;
		e=v;
		f=n;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Cs3 c3= new Cs3();
     c3.sum();
     Cs3 c4=new Cs3(100);
     c4.sum();
     Cs3 c5=new Cs3(12, 210);
     c5.sum();
     Cs3 c6=new Cs3(12, 21 , 230, 22.30f, 1.20f);
     c6.sum();
	}
	public void sum()
	{
	int sum = a+b+c;
	float mul= e*f;
	    System.out.println("=============================");
		System.out.println("Toatal sum iS "+sum); 
		System.out.println("My multification is "+mul);
		System.out.println("=============================");
	}
	
	
	

}
