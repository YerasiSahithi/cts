package com;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class FileOutPutStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try{    
            FileOutputStream fout=new FileOutputStream("E:\\hello.txt"); 
            String s="welcome";    
            byte b[]=s.getBytes();    

            fout.write(b);    
            fout.close();    
            //System.out.println("created");    
           }catch(Exception e){System.out.println(e);}    
     
    try{    
        FileInputStream fin=new FileInputStream("E:\\hello.txt");    
        int i=fin.read();  
        System.out.print((char)i);    

        fin.close();    
      }catch(Exception e1){System.out.println(e1);}  
    
    
    try {
        FileInputStream fin=new FileInputStream("E:\\hello.txt");    
        int i=0;    
        while((i=fin.read())!=-1){    
         System.out.print((char)i);    
        }    
        fin.close();    

    }catch(Exception e){System.out.println(e);}
}
}


