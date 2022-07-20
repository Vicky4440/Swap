package inheritance;

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		University u=new University();//super most class
		u.clg();
		u.tech();
		System.out.println("*************");
		
		College c =new College();// super class
		c.student();
		c.tech();
		c.clg();
		System.out.println("*************");
		
		Student s=new Student();// sub class
		s.examno();
		s.clg();
		s.student();
		
		
		
	}

}
