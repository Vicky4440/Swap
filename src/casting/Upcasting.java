package casting;

public class Upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SystemIntegrationTesting s=new SystemIntegrationTesting();
		s.functional();
		s.nonfunctional();
		
		
		FunctionalTesting f= new FunctionalTesting();
		f.functional();
		f.nonfunctional();
		
		SystemIntegrationTesting s1=new FunctionalTesting ();
		s1.functional();
		s1.nonfunctional();

	}
		
	}
