package Importan_Interview;

public class Revrse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "12345Infosys";
		for(int i=5;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			System.out.print(ch);
			
		}
		System.out.println("===========");
for(int j=s.length()-1;j>=5;j--) {
	char vp = s.charAt(j);
	System.out.print(vp);
}
		
		
		
	}

}
