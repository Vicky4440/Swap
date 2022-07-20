package DailyPractise;

public class findoutword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
	String s="jhgwgkdhfdkagdygwkhfuINFOSYS";

 
		 int  op =s.indexOf("I");
	System.out.println(op);
	
	
	for(int i=s.length()-1; i>=21;i--) {
		
		char ch = s.charAt(i);
		System.out.print(ch);
		}
		
	}

}
