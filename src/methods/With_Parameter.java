package methods;

public class With_Parameter {

	public static void main(String[] args) {
		 With_Parameter b=new  With_Parameter();
		b.batch_info("Vikram", 22.5f, "Kolhapur", "Mechanical", 'M'); 
        b.batch_info("Snehal", 22.3f, "Sangli", "Computer", 'F');
        With_Parameter d=new With_Parameter();
        d.addition(1230, 0124, 0125, 1200, 1.20f,1.23f, 1.02f, 1.230f);
        
        
        
	}
	
public void batch_info(String name, float age, String district,String branch, char gender)//with parameter
	{
		
		
		
		
		System.out.println("===================================");
		System.out.println("My Name Is "+name);
		System.out.println("My Age Is "+age);
		System.out.println("My District Is "+district);
		System.out.println("My Branch Is "+branch);
		System.out.println("My Gender Is "+ gender);
		System.out.println("====================================");
		
		
		
	}
    
    public  void addition(int a, int b,int c, int d ,float e, float f ,float g ,float h)
    {
    int add;
     add=a+b;
     int subb;
      subb=c-d;
      float percentage;
      percentage =e+f;
      float multification;
      multification=g*h;
      System.out.println("===================================");
		System.out.println("My addition is "+add);
		System.out.println("My subtraction is "+subb);
		System.out.println("My perecentage "+percentage);
		System.out.println("My Multification is "+multification);
	    System.out.println("===================================");
    
    
    	
    	
    	
    	
    }
    
    
    
    
    
    
    
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	

