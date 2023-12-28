package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		int num = sc.nextInt();	
		
		//세로
		for(int i=1; i<=num; i++) {
			for(int k=1; k<=i; k++) {
				
				System.out.print(i);
			
			}
					System.out.println();
				
		
		}	
		
sc.close();
	}

	
}
