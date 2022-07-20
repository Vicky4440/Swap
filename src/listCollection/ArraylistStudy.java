package listCollection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class ArraylistStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList al= new ArrayList();
		al.add("Vikram");
		al.add("12");
		al.add("@@@");
		al.add("nalawade");
		al.add("22");
		al.add(null);
		al.add(null);
		
		
		System.out.println(al.size());
		System.out.println(al.indexOf("Vikram"));
		System.out.println(al.lastIndexOf("nalawade"));
//		
//		al.set(4, "24");
//		
//		System.out.println(al.get(4));//update array list
//		
//		System.out.println(al.get(6));
//		System.out.println(al.contains(7));
		
		
		//al.add(1, "MorningBatch");// right shift--> when you are inserting element in between array list

		//System.out.println(al);
	//	al.remove(1);//left shit--> when you try to remove/delete from in between of array list
	//	System.out.println(al);
		
		//uing iterator
		System.out.println("=================");
		Iterator it = al.iterator();
		while (it.hasNext())
		{
		System.out.println(it.next());
		}
		System.out.println("=================");
		
		//moving through list using for loop 
		System.out.println("=================");
		for(int i=0;i<=al.size()-1;i++)
		{
		System.out.println(al.get(i));
		}
		System.out.println("=================");	
		//
		for(Object v:al)
		{
			System.out.println(v);
		}
		
		
	}

}
