package com;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableExample implements Serializable {
	public static void main(String args[])
	{
	  try{  
		 
		  SerializableExample s1 =new SerializableExample();  
		  FileOutputStream fout=new FileOutputStream("E:\\hello.txt");  
		  ObjectOutputStream out=new ObjectOutputStream(fout);  
		  out.writeObject(s1);  
		  out.close();  
		  System.out.println("success");  
		  }catch(Exception e){System.out.println(e);}  
		 }  
}

