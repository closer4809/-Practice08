package com.javaex.ex05;

public class Mul {

    private int a;
    private int b;
    int c;
    public Mul() {
		
	}





	public Mul(int a, int b) {
		
		this.a = a;
		this.b = b;
		
	}

	public int getA() {
		return a;
	}





	public void setA(int a) {
		this.a = a;
	}





	public int getB() {
		return b;
	}





	public void setB(int b) {
		this.b = b;
	}

    
    public void setValue(int a, int b) {
    	c=a*b;
    }

    public int calculate() {
    	return c;
    }

    public void showInfo() {
    	System.out.println(a*b);
    }
}
