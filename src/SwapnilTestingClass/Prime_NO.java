package SwapnilTestingClass;

public class Prime_NO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//		int num= 28; 
//		boolean vp=false;
//		for(int i=2;i<=num/2;i++) {
//			
//			if(num % i == 0) {
//				vp=true;
//						break;
//			}
//		}
//			if(!vp) {
//				 System.out.println(num + " is a prime number.");
//			}
//			else {
//
//			      System.out.println(num + " is not a prime number.");
//			}
//		
		
		int s=3;
		boolean dm= false;
		for(int i=2;i<=s/2;i++){
		if(s% i==0){
		dm=true;
		break;
		}


		}
		if(!dm){
		System.out.println(s+ "prime number");
		}
		else{
		System.out.println(s+ "Not prime number");}
	}

}
