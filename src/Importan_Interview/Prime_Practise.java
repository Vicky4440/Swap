package Importan_Interview;

public class Prime_Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=29;
		Boolean flag=false;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println(num + " prime no");
		}
		else {System.out.println("not prime no");}
	}

}
