package Importan_Interview;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[]vp=new int[] {1,25,78,4,63};
		Arrays.sort(vp);
		for(int i=0;i<=vp.length-1;i++) {
		System.out.println(vp[i]);}
	System.out.println("===================");
	for(int i=0;i<=vp.length-1;i++) {
	for(int j=i+1;j<=vp.length-1;j++) {
		if(vp[i]>vp[j]) {
			int temp=0;
			temp=vp[i];
			vp[i]=vp[j];
			vp[j]=temp;
			
		}
		
	}
	System.out.print(" "+vp[i]+" ");
	}
	
}
}