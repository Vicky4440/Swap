package polymorphism;

public class MethodLoadingCompile {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodLoadingCompile m=new MethodLoadingCompile();
		
		m.add();
		m.add(012, 250);
		m.add(2, 20, 05);
		
		
	}
	
	
	public void add() {
		int a=25;
		int b=24;
		int sum=a+b;
		System.out.println(sum);
		
	}
	public void add(int a,int b) {
		int sub=b-a;
		System.out.println(sub);
		
		
	}
	public void add(int a,int b, int c) {
		int mul=a*b*c;
		System.out.println(mul);
	}
	
	
	
	
	
	
	
	

}
