package controlStatment;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if you type a pin correct ----->withdraw amount ,else check the pin
		// if amount is valid ---> withdraw your a cash,else invalid cash
		
		int pin=4455;
		int amount= 1000;
		
		if(pin==4455)
		{
			System.out.println("passward is correct, please inter withdraw amount");
			
			if(amount>=500 && amount<=10000) {
				
				System.out.println("please withdraw your a cash");
				}
			else {
				System.out.println("Please inter valid amount");
			}
		}
		else {
			
			System.out.println("Please inter correct pin");
		}
	}

}
