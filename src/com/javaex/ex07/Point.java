package com.javaex.ex07;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	
	public boolean equals(Point a) {
		if(this.x == ((Point)a).x ) {
			return true;
		}else{
			return false;
		}
	}
	
	
}

	

