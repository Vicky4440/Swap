package Importan_Interview;

public class Prime_NUMBER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int num = 29;
//	    boolean flag = false;
//	    for (int i = 2; i <= num / 2; ++i) {
//	      // condition for nonprime number
//	      if (num % i == 0) {
//	        flag = true;
//	        break;
//	      }
//	    }
//
//	    if (!flag)
//	      System.out.println(num + " is a prime number.");
//	    else
//	      System.out.println(num + " is not a prime number.");
//	  }
//	
	int vp=2;
	 boolean flag1 = false;
	for(int i=2;i<=vp/2;i++) {
		if(vp%i==0) {
			flag1=true;
			break;
		}
	}
	if(!flag1) { System.out.println(vp + "prime no");}
	else {System.out.println(vp + " not prime no");}
	
	
	
	}
}

