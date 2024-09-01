package kita3;

public class Kita3_8 {

	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();
		int y = new java.util.Scanner(System.in).nextInt();
		
		if ((x >= 0 && x <= 100) && (y >= 0 && x <= 100)) {
			
		
	 	  if ((x >= 60 && y >= 60) || (x + y >= 130) || 
		     (x + y >= 100) && (x >= 90 || y >= 90)) {
			   System.out.println("合格");
		  }
		  else {
			System.out.println("不合格");
		  }
		}

	}

}
