package interfacestudy;

public class Emplement implements InterfaceClass {
int a=10;
int b=20;
int c,d;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emplement  e=new Emplement ();
		e.add();
		e.sum();
	}

	@Override
	public void sum() {
		c=a+b;
		System.out.println("sum of int "+c);
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		d=c+a;
		System.out.println("sum of int "+d);
	}

	
	
	
	
	
}
