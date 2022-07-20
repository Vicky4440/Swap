package keyword;

public class ClassA {
	
	int a=1245;//global value of a

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassA c2A= new ClassA();
		c2A.test();
		
		
	}
	public void test() {
		 int a=123;// local variable
		 int sum =900+a;
		 int sum1=1600-this.a;//global variable
		
		System.out.println(sum);
		System.out.println(sum1);
	}

}
