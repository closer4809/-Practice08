package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println(">>");
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	
    	int c = a+b;
    	
    	System.out.println(c);
    	
    	
    	sc.close();
    	
    }
}
