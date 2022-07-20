package keyword;

public class Sample {

	int a=24;
	int b=29;
	
	int sum=a+b;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample s=new Sample();
s.sum();
	}

	
	public void sum() {
		int a=24;
		int b=29;
		int sub=this.a-this.b; 
		int sum= a+b;
		System.out.println(sum);
		System.out.println(this.sum);//this method using calling global variable
		System.out.println(sub);
	}
	
	
	
	
	
	

}



