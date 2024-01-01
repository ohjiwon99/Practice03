package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//13번 문제에 아래와 같이 계산식이 표시되도록 프로그램을 작성하세요
		
		
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= num; i++) {
			System.out.print(i+"+");
			sum=i+sum;
			
		}System.out.println(num+"\n합계:"+ sum);
		
		

	sc.close();}
		

	}


