package com.javaex.practice;

public class Ex05 {

	public static void main(String[] args) {
		int i =1;
		boolean flag = true;
		
		while(flag) {
			if (i>=5) {
				flag = false;// 성립되기 때문에 한번 더 돈다.
			}
		System.out.println(i);
		i=i+1;
		}

	}

}
