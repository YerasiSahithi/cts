package com;
import java.util.*;
import java.util.stream.Stream;  
//import java.util.List;
//import java.util.ArrayList;
class Employees
{
	int id,salary;
	String name;
	public Employees(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}		
}
public class LambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employees>list=new ArrayList<Employees>();
list.add(new Employees(1,1000,"abc"));
list.add(new Employees(2,2000,"bc"));
list.add(new Employees(3,3000,"ab"));
list.add(new Employees(4,4000,"ac"));
Stream<Employees>filterdata= list.stream().filter(p -> p.salary > 2000);

Collections.sort(list,(e1,e2)->{  
return e1.name.compareTo(e2.name);  
});  


filterdata.forEach(
        Employees -> System.out.println(Employees.name+": "+Employees.salary)
);
for(Employees e:list)
{
	System.out.println(e.id+" "+e.name+" "+e.salary);  
}
	}

}
