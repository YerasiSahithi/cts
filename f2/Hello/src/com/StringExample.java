package com;

public class StringExample {
	static String s1= "Welcome";
	 static String s2="hellokkkk";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(s1.charAt(1));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.length());
		System.out.println(s1.equals(s2));
		System.out.println(s1.concat(s2));
		System.out.println(s1.contains("el"));
		//System.out.println(s1.contains("hi"));
		System.out.println(s1.endsWith("aa"));
		System.out.println(s1.indexOf("el"));
		System.out.println(s1.lastIndexOf("me"));
		System.out.println(s1.replace('l','a'));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.charAt(1));
		System.out.println(s1.compareToIgnoreCase(s2));
	}

}
