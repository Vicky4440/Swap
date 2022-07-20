package controlStatment;

public class IfElseStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  //  if temperature is greater than and equal to 30 ----> summer season
 //	if temperature is less than 25 -----> rainy season
// if temperature is less than and equal to 25 ----> winter season 		
	int temprature=22;
	if (temprature>=30)
	{
		System.out.println("You are in summer season");
		
	}
	else if (temprature>25)
	{
		
		System.out.println("Your are in rainy season");
		
	}
	else if (temprature<=25)
		System.out.println("You are in winter sesoan");
	}

}
