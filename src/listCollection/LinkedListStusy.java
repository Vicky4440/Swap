package listCollection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListStusy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList op=new LinkedList<>();
		
		op.add("vikram");
		op.add("1235");
		op.add("Vikram");
		op.add("nalawade");
		op.add("#$%");
		op.add(null);
		op.add(null);
		
		System.out.println(op.size());
		System.out.println("================");
		for(int i=0;i<=op.size()-1;i++) {
		System.out.println(op.get(i));
		}
		System.out.println("=================");
		// using iterator
		Iterator ap = op.iterator();
		System.out.println("=================");
		System.out.println(op);
		System.out.println("=================");
		
		//using while
		while(ap.hasNext()) {
			System.out.println(ap.next());
		}
		System.out.println("=================");
		
		//for with create object
		System.out.println("=================");
		for(Object sp:op) {
			System.out.println(sp);
		}
		System.out.println("=================");
		
		//enumeration used for vector interface class
	}

}
