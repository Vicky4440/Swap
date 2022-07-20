package DailyPractise;

import java.util.Arrays;

public class ASciiTAble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="#684566I$@F%OSYS#^%&";
		for(int i=0;i<=s.length()-1;i++) {
			char ch = s.charAt(i);
			if(ch>65&&ch<90) {
				System.out.print(ch);
			}
		}
		System.out.println("====================");
		int []num =new int[] {12,45,2,30,25,5};
		Arrays.sort(num);
		

	}

}
