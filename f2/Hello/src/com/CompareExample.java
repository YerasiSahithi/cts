package com;

//package access;

public class CompareExample {
	static String s1 = "hello";
	static String s2 = "hai";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(s1);
		System.out.println(s2);
		if (s1.length() != s2.length()) {
			System.out.println("not equal");
			// return false;
		} else {
			boolean count = true;
			
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(i)) {
					count = false;
					break;

				}
			}

			if (count) {
				System.out.println("equal");
			} else
				System.out.println("not equal");
		}
	}
}
