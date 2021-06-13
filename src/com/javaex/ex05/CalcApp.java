package com.javaex.ex05;

import java.util.Scanner;



public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	
    	System.out.println(">>");
    	String a = sc.nextLine();
    	
    	String[] sArray = a.split(" ");
    	
    	int x = Integer.parseInt(sArray[0]);
    	int y = Integer.parseInt(sArray[2]);
		

    	Add add1 = new Add(x, y);
    	Div div1 = new Div(x, y);
    	Mul mul1 = new Mul(x, y);
    	Sub sub1 = new Sub(x, y);
    	
    	
    	
			
			
		switch (sArray[1]) {
		case "+":
			add1.showInfo();
			break;
	
		case "-":
			div1.showInfo();
			break;
		
		case "*":
			mul1.showInfo();
			break;
		
		case "/":
			sub1.showInfo();
			break;
    	
		}
    	
    	
    	
    	
    
    	
    	
    	
    	
    	
    	sc.close();
    	
    }
}
