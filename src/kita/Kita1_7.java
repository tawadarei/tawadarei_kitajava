package kita;

public class Kita1_7 {

	public static void main(String[] args) {
	  
	  int x, y, t;
	  x = 3;
	  y = 7; 
	  t = x; // x = 3, y = 7, t = 3
	  x = y; // x = 7, y = 7, t = 3
	  y = t; // x = 7, y = 3, t = 3
	  
	  System.out.println("x=" + x + ",y=" + y);
	  

	}

}
