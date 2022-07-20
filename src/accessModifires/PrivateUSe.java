package accessModifires;

public class PrivateUSe {
     public int a=29;// non static global variable
     private int b=31;//non static private variable
     protected int c=24;//non static protected variable
     public int d=31; //non static public variable
      int e=34;//non static default variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateUSe p=new PrivateUSe();
            p.tset();
            PrivateUSe.test1();
            System.out.println(p.a);//calling global variable
            System.out.println(p.b);//calling private variable
            p.test3();
	}
	

	
	public void tset() {
		
		System.out.println("this is public test method");
	}
	
	
	private static void test1() {
		
		System.out.println("This is private test method");
	}
	
	protected void test3() {
		
		System.out.println("this is protected test method");
		
	}
}
