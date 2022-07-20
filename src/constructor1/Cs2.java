package constructor1;

public class Cs2 {
      float b;
      float c;
       int f;
       int e;
       
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cs2 v1 = new Cs2();
v1.mul();
	}
	Cs2()
	{
		b=1.2f;
		c=2.2f;
		e=12;
		f=10;
	}
public void mul()
{
	int sub=f-e;
	float multi=b*c;
	String name = "velocity";
	System.out.println("My multification "+multi );
     System.out.println("my name is "+ name);
     System.out.println("My subtraction Is "+sub);
}
}
