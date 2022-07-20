package inheritance;
 import accessModifires.PrivateUSe;// calling protected method from different package
public class Protected extends PrivateUSe{
	
	
	int a=10;
	public static void main(String[] args ) {
		
		Protected p2=new Protected();
		p2.test3();
		p2.test4();
	}
	
	public void test4() {
		
		System.out.println("my new packge method");
		
	}
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	

