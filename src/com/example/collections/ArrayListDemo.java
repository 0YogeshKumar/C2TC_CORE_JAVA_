package com.example.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		List al=new ArrayList();
		al.add(10);
		al.add(new Integer(10));
        al.add("Gayatri");
        Student s1=new Student(1,"Bob", 0);
        al.add(s1 );
        System.out.println(al);
        Iterator i=al.iterator();
        while(i.hasNext()) {
        	Object obj=i.next();
        	System.out.println(obj);
        }
        System.out.println(al.size());
        al.add(0, 5);
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
        
        
        List al1=new ArrayList<>();
        al1.add(100);
        al1.addAll(al);
        System.out.println(al1);
     
	}

}
