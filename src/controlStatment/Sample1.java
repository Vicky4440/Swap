package controlStatment;

public class Sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// if grade a then yours mark ---->75-90
		// if grade b then yours marks ---->66-75
		//If grade c then yours marks is ---->40-66
		
		char grade= 'A';
		if(grade=='A' )
		{
			System.out.println(" If grade A then yours marks is 75-90");
		}
		
		else if ( grade =='B')
		{	System.out.println("If grade B then yours marks is 66-75");}
		
		
		else if (grade=='C') {
			System.out.println("If grade C then yours marks is 40-66");
		}
		
		else
			
		System.out.println(    "If you can not obtained above grade then will you fail");
		
		
		
	}

}
