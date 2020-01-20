package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String line;
		int count=0;
        FileReader file = null;
		try {
			file = new FileReader("E:\\hello.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        BufferedReader br = new BufferedReader(file);  

	}

}
