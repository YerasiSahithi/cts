package com;
import java.util.*;
public class HasmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map m= new HashMap();
m.put(1,"a");
m.put(2,"b");
m.put(3,"c");
m.put(4,"d");
Set set=m.entrySet();
m.remove(1);

Iterator itr=set.iterator();
while(itr.hasNext())
{  
    Map.Entry entry=(Map.Entry)itr.next();
    m.entrySet();
    //m.remove(1);
   //.sorted(Map.Entry.comparingByKey())  ;
    System.out.println(entry.getKey()+" "+entry.getValue());  
}

	}
}
