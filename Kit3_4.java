package kita3;

public class Kit3_4 {

	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();
		int y = new java.util.Scanner(System.in).nextInt();
		
		if (x > y) {
			System.out.println("xはyより大きい");
		}
		else if (x < y) {
			System.out.println("xはyより小さい");
		}
		else {
			System.out.println("xとyは等しい");
		}
	}

}
