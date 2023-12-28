package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=1; i<=100; i++) {
			 if(i%5==0 && i%7==0) {
				 System.out.println(i);
			 }
		
		}
	
	sc.close();
	}

}
