package com;
import java.util.*;

class Student implements Comparable<Student>
{
	public String name;
	public int sid;
	public Student (String name)
	{
		this.name=name;
}
	public int compareTo(Student Person) {
		return name.compareTo(Person.name);
	}
}
	public class CompareToExample {
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Student> al= new ArrayList<Student>();
al.add(new Student("Viru"));
al.add(new Student("Mukesh"));
al.add(new Student("Tahir"));
al.add(new Student("Saurav"));

Collections.sort(al);
for(Student s:al)
{
	System.out.println(s.name);
}

	}

}
