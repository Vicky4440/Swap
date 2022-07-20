package Importan_Interview;

public class Sorting_no {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []arry=new int[] {123,457,21,45,78,32,489};
		
for (int i=0;i<=arry.length-1;i++) {
	for(int j=i+1;j<=arry.length-1;j++) {
		int temp= 0;
		if(arry[i]>arry[j]) {
			temp=arry[i];
			arry[i]=arry[j];
			arry[j]=temp;
			
		}
		
	}
	System.out.println(arry[i]);
      }
	   }

}
