

import java.util.*;
import java.util.Iterator;
import java.util.ListIterator;
public class ArrayListEX {
    public static void main(String[] args) {
		int n=5; // size of arraylist
		// Type safe // Type as Wraper class
		ArrayList<Integer> num = new ArrayList<>(n);
		
		// Add num to our arraylist by loop
		for ( int i =1 ; i<= n; i++) {
			num.add(i); // add(index) 
		}
		//printing element
		
		System.out.println(num);
		
		for (int i=0 ;i<num.size();i++) {
			
			System.out.println(num.get(i));
		}
		System.out.println("---------------------");
		// create Arraylist without size
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Elon");
		names.add("Mark");
		names.add("Tony");
		names.add("Rishi");
		names.add("Putin");
		names.add("Trump");
		names.add("Trump");
		for (int i=0 ;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		System.out.println("***for each loop****");
		// for each loop to gaing data
		
		for(String per :names) {
		System.out.println(per +"\t"+ per.length());
		}
		System.out.println("---------------------");

		for(String per :names) {
			StringBuffer b = new StringBuffer(per);
			System.out.println(b.reverse());
			}
			
		System.out.println("--------Using Itretor-------------");

		// usoing Iterator
		 Iterator<String> itr = names.iterator();
		 while(itr.hasNext()) {
			 String nxt = itr.next();
			 System.out.println(nxt);
		 }
		 System.out.println("  *** Lets REvers****");
		 ListIterator<String> ltr = names.listIterator(names.size());
		  while(ltr.hasPrevious()) {
			  String pre = ltr.previous();
					  System.out.println(pre);
		  }
			 System.out.println("***************************");

			System.out.println("****For Each Method******"); 
			 names.forEach(e->{
				 System.out.println(e);
			 });
	}
}
