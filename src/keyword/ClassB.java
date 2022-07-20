package keyword;

public class ClassB extends ClassA {
  int a=874;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ClassB c=new ClassB();
         c.test2();
         c.test();
	}
	
	
	public void test2() {
		int a=457;
		
		int sum=a+10;//local variable
		int sum1=this.a+123;//global variable
		int sum3=super.a+124;//super global variable
		
		
		System.out.println(sum);
		
		System.out.println(sum1);
		
		System.out.println(sum3);
		
		
	}
	
	
	

}
