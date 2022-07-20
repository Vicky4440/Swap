package listCollection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector v= new Vector();
		v.add(1);
		v.add("Pune");
		v.add(true);
		v.add('A');
		v.add(123.98);
		v.add(null);
		v.add(null);
		v.add("Pune");
		System.out.println(v);
		v.add(4, "India");
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		System.out.println(v.contains("India"));
		System.out.println(v.size());
		System.out.println("===============");
		for(Object b:v)
		{
		System.out.println(b);
		}
		System.out.println("===============");
		Iterator it = v.iterator();
		while (it.hasNext())
		{
		System.out.println(it.next());
		}
		System.out.println("===============");
		Enumeration en = v.elements();
		while(en.hasMoreElements())
		{
		System.out.println(en.nextElement());
		}
	}
}
