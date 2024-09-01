package kita3;

public class Kita3_10 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		int x = new java.util.Scanner(System.in).nextInt();
		@SuppressWarnings("resource")
		int y = new java.util.Scanner(System.in).nextInt();
		
		
		if ((x < y) && ((x % 2==0) && ( y % 2 == 0))) {
		  System.out.println(
				  "xはyより小さく、かつxとyは共に偶数である");	
		}
		if (x == y && x < 0) {
		  System.out.println(
				  "xとyは等しく、かつ、xとyは負の数である");
		}
		if ((x < y) || (x % 2 == 0)) {
	      System.out.println(
	      		  "xはyより小さい、または、xは偶数である");
		}
		if ((x <= 10 || x >= 100) && ((y >= 10) && (y <= 100))) {
		  System.out.println(
				  "xは10以下または100以上で、かつ、ｙは10以上かつ100以下である");
		}
		if (!(x < 0 && y < 0)) {
		  System.out.println("xもyも負の数である、ではない");
		}
	}

}
