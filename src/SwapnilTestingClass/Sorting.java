package SwapnilTestingClass;

import java.util.Arrays;

public class Sorting {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int [] array=new int[] { 12,1,123,45,78};
		//using sort method
	
	Arrays.sort(array); 
	
	
	for(int i=0;i<=array.length-1;i++) {
		System.out.println(array[i]);
	}
	
	
	//using for loop
	
	for(int i=0;i<array.length-1;i++) {
		for(int j=1+i;j<array.length-1;j++) {
			int temp=0;
			if(array[i]>array[j]) {
				
				temp=array[i];
				array[i]=array[j];
				array[j]=temp;
				
				
			}
		}
		System.out.println(array[i]);
	}

}
}
