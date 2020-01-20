package com;
import java.util.*;
 class Employee1 implements Comparable<Employee1>
{
	public String name;
	public int id,salary;
	public Employee1(String name,int id,int salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public int compareTo(Employee1 emp) {
	return this.id-emp.id;
}
}
 
   class Employee2 implements Comparator<Employee2>
 {
	  public String name;
		public int id,salary;
	 public Employee2(String name, int id, int salary) {
		 this.name=name;
		 this.id=id;
		 this.salary=salary;
			// TODO Auto-generated constructor stub
		}
	public int compare(Employee2 Ename , Employee2 Eid,Employee2 Esalary) {
	 	// TODO Auto-generated method stub
		 Employee2 e1=(Employee2) Ename;
		 Employee2 e2=(Employee2) Eid;
		 Employee2 e3=(Employee2) Esalary;
		 return this.id-Ename.id;
		 //return this.salary-Esalary.salary;
	 }
 }
public class CompareToExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee1> e= new ArrayList<Employee1>();
		e.add(new Employee1("Viru",11,1000));
		e.add(new Employee1("ss",21,2000));
		e.add(new Employee1("aa",8,3000));
		Collections.sort(e);
		for(Employee1 s:e)
		{
			System.out.println(s.name);
		}
		ArrayList<Employee2> ep= new ArrayList<Employee2>();
		ep.add(new Employee2("abc",10,8000));
		ep.add(new Employee2("ss",21,2000));
		ep.add(new Employee2("aa",8,3000));
		Collections.sort(ep,new  );
		Iterator
		for(Employee2 s:ep)
		{
			System.out.println(s.name);
		}

	}

}


