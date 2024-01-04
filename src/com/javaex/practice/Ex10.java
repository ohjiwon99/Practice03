package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		
		
		int max=0;
		for (int i = 0; i < 5; i++) {
			System.out.println("숫자: ");
			int a = sc.nextInt();
			
			
			if (max<a) {
				max=a;
			}
		}
		System.out.println("최대값은"+max+"입니다.");
			
		
	sc.close();}}
		






