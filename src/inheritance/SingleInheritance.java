package inheritance;

public class SingleInheritance {

	public static void main(String[] args) {
		
		Father f=new Father();
		f.car();
		f.home();
		System.out.println("===============");
		
		Son s= new Son();
		s.cycle();
		s.mobile();
		s.car();s.home();
		System.out.println("===============");
      
	}

}
