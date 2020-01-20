package com;

import java.time.*;

public class Durationexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duration d1 = Duration.between(LocalTime.MAX, LocalTime.NOON);
		System.out.println(d1.getSeconds());
		Duration d2 = d1.minus(d1);
		System.out.println(d2.getSeconds());

	}

}
