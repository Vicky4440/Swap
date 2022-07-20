package DailyPractise;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] input =new int[]  {1,2,2,1,1,1,2,2,1,2,1,2};
		
		
		Arrays.sort(input);
		for(int i=0;i<=input.length-1;i++) {
			System.out.print(+input[i]+",");
		}
	}

}
