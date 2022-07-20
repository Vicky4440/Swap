package inheritance;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SystemIntegrationTesting ss1 =new SystemIntegrationTesting();
		ss1.typesoftesting();
		System.out.println("++++++++++++++++++++++++++++++++++");
		
		
		SanityTesting s2=new SanityTesting();
		s2.typesoftesting();
		s2.tester();
		System.out.println("**********************************");
		
		SmokeTesting s3 =new SmokeTesting();
		s3.typesoftesting();
		s3.testerdevloper();
		
	}

}
