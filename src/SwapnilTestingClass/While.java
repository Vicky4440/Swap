package SwapnilTestingClass;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method
		int i=2;
		while(i<=8) {
			System.out.println(i*i*i);
			i++;
		}
		System.out.println("===========");
		
		String v="Swapnila";
		String b="Swapnila";
		System.out.println(v.charAt(6));
		System.out.println(v.indexOf("l"));
		System.out.println(v.indexOf("i"));
		System.out.println("===========");
		System.out.println(v.lastIndexOf("a"));
		System.out.println("===========");
		
		//System.out.println(v.replaceAll("s", "l"));
		//System.out.println(v.replace("S", "l"));
		//System.out.println(v.replaceAll(v, b));
		//System.out.println(v.replace("S", b));
		System.out.println(v.substring(6));
		System.out.println(v.substring(1, 4));
		//sp;it
	
		System.out.println(v.trim()+b.trim());
		
	}
	
	

}
