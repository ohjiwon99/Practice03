package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
              System.out.print(j + " * " + i + " = "+i*j);
              System.out.print("    ");
            }
            System.out.println();
          
        }
      
	        
	    sc.close();
}}