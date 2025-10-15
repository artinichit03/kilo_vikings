package com.vikings.automation.tests;

public class sample3 {
	public static void main(String[] args) {
		int marks=75;
		if(marks >= 90) {
			System.out.println("Passed with 1st class");
		}else if(marks>=70 && marks<90){
			System.out.println("Passed with 2nd class");
		}else if(marks>=50 && marks<=70) {
			System.out.println("Passed with distinction");
		}else if(marks>35 && marks<=60) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
	}
}
