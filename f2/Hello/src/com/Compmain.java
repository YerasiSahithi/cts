package com;

import java.util.*;

public class Compmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();
		a.add(new Student1(10, "xyz"));
		a.add(new Student1(20, "abc"));
		a.add(new Student1(3, "pqr"));
		Collections.sort(a, new NameComparator());
		Iterator i = a.iterator();
		while (i.hasNext()) {
			Student1 st = (Student1) i.next();
			System.out.println(st.sid + "  " + st.sname);
		}

	}

}
