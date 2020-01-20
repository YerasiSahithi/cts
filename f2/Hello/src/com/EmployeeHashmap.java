package com;
import java.util.*;
class Employeehash
{
	int id;
	String name;


public Employeehash(int eid, String name)
{
	this.id=id;
	this.name=name;
}
}
public class EmployeeHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Map<Integer,Employeehash> map=new HashMap<Integer,Employeehash>();    
Employeehash h1=new Employeehash(10,"a");
Employeehash h2=new Employeehash(20,"b");
Employeehash h3=new Employeehash(30,"c");
		map.put(1, h1);
		map.put(2, h2);
		map.put(3, h3);
	    for(Map.Entry<Integer, Employeehash> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        Employeehash h=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(h.id+" "+h.name);   
	    }    
	}

}
