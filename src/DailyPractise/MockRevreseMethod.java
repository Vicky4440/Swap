package DailyPractise;

public class MockRevreseMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="kdfgsfdadfiuyebkcfbakINFOSYS agjagggag";
		
		for(int i=0; i<s.length();i++) {
			
			char ch= s.charAt(i);
			if( ch>65 && ch<90) {
				System.out.print(ch);
			}
			
		}
			
			
			
			
	//	String f="123456infosys";
	//	String revrse=" ";
		//for(int i=6; i<f.length();i++) {
			
			//char op = f.charAt(i);
		//	revrse=op+revrse;
			
		//}
		//System.out.println(revrse);
		
		String f="123456infosys";
	          char[] op = f.toCharArray();
		
		for(int  i= op.length-1;i>5;i--) {
			System.out.print(op[i]);
		}
		
		for(int i=8 ;i>=0; i--) {System.out.println(i);}
	
		String d="12346Vikram";
		char[] tp = d.toCharArray();
		for(int i=tp.length-1; i>=5;i--) {
			System.out.print(tp[i]);
		}
	
		
		
		String g="12346Vikram";
		for(int i=0; i<g.length();i++) {
			
			char cv = g.charAt(i);
			if(cv>65 && cv<122) {
				System.out.print(cv);
			}
			
			
		}
		
		String v1="kdfgsfdadfiuyebkcfbakINFOSYS agjagggag";
		
		int o=v1.indexOf("I");
	
		System.out.println(o);
		
		for(int  i=21;i<=v1.length()-1;i++) {
			char c = v1.charAt(i);
			System.out.println(c);
		}
		
		
		
		
		
	}

}
