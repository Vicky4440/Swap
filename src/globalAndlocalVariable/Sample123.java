package globalAndlocalVariable;

public class Sample123 {
    int a=20;
    int b=26;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample123 g2= new Sample123();
		g2.addition();
		System.out.println(g2.b);
		int sum=12+g2.b;
        System.out.println("my sum is "+sum);

	}
         public void addition()
         {
        	 
        	int sum1= a+b; 
        	 
        	 System.out.println("my sum is"+sum1 );
         }
}
