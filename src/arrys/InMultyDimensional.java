package arrys;

public class InMultyDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		
		
		int arr[][]= {{1,2},{3,4},{4,5}};
		System.out.print(arr[0][0]+" ");
		System.out.print(arr[0][1]+" ");	
		System.out.println();
		System.out.print(arr[1][0]+" ");
		System.out.print(arr[1][1]+" ");
		System.out.println();
		System.out.print(arr[2][0]+" ");
		System.out.print(arr[2][1]+" ");
		System.out.println("=============");
		
		
		//  matrix
		
		
		int ar[][]={{5,6},{7,8}};
		
		
		
		
		for (int i =0;i<= ar.length-1;i++)// for outer loop for row
		{
			
		for (int j= 0 ;j<=ar.length-1;j++)// for column
		
		
		{
			System.out.print(ar[i][j]+" ");
			
		}
		System.out.println();
		
		}
	/// Reverse variable
		
//		String str="vikram";
//		String word []=str.split("");
//		 for(int i=word.length-1;i>=0;i--) {
//			 
//			 System.out.println(word[i]);
//		 }
		
	}

}
