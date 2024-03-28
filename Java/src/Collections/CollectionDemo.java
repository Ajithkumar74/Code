package Collections;

import java.util.*;

public class CollectionDemo {
//The Integer class  wraps a value of the primitive type int in an object. An object of type Integer contains a single field whose type is int. 
	public static void main(String[] args) {
		int a[]=new int[5];//fixed size
		ArrayList<Integer> alist=new ArrayList<Integer>();//fiexiable
		alist.add(8);
		
		for (int i = 0; i <=10; i++) {
			alist.add(i);
			
			System.out.println(alist);
			alist.add(100);
			ArrayList<String> slist=new ArrayList<String>();
		
		}
		
	}

}
