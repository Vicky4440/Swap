package arrys;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="123456Vikram";
	   String revrse="";
	   for(int i=6;i<=s.length()-1;i++) {
		char op = s.charAt(i);
		 revrse= revrse+op;
	   }
	   System.out.println( revrse);
	}

}
