package com;
 import java .util.*;
public class AgeComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student1 s1= (Student1) o1;
		Student1 s2=(Student1) o2;
		if(s1.sid==s2.sid)
		return 0;
		else if(s1.sid>s2.sid)
			return 1;
		else 
			return -1;
	}

}
