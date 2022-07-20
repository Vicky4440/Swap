package SwapnilTestingClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sort_metohd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []array=new int[]{12,36,1,45,62,23,45 };
		for(int i=0;i<=array.length-1;i++){
		 for(int j=i+1;j<=array.length-1;j++){
		   int temp= 0;
		if(array[i]>array[j]){
		temp=array[i];
		array[i]=array[j];
		array[j]=temp;

		  }
		   }
		System.out.println(array[i]);
		}
		System.out.println("===============");
//string sorting
		
		int[]sp=new int[]{456,12,789,63};
		
		Arrays.sort(sp);
		for(int i=0;i<=sp.length-1;i++) {
				System.out.println(sp[i]);
			}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}