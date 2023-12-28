package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		
		while(true) {		
			//반복
		System.out.println("숫자: ");
		int a = sc.nextInt();
		
		if(a==0) {
			System.out.println(" ");
			
		}//else (if 다음은 else인데 생략한 이유는 브레이크 다음으로는 갈 수 없기 때문)
		
		/* if (a%3==0) {
			System.out.println("3의 배수 입니다.");		
		}else {
			System.out.println("3의 배수가 아닙니다.");
	
		
		sc.close();    
		
		}*/
	}}}




