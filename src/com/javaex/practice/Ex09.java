package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= 9; j++) {
              System.out.print((i+j) + " ");
             
            }
            System.out.println();
          
        }
      
	        
	    sc.close();


	}

}
