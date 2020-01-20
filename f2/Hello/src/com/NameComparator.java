package com;
import java.util.*;
public class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student1 s1= (Student1) o1;
		Student1 s2=(Student1) o2;
		return s1.sname.compareTo(s2.sname);
	}

}
