package kita3;

public class Kita3_7 {

	public static void main(String[] args) {
		
		int x = new java.util.Scanner(System.in).nextInt();
		
		// ケース１
		if (x >= 60) {
			System.out.println("合格");  
		} else {
			System.out.println("不合格");
		}
        // ケース２
		if (x >= 80) {
			System.out.println("大変よくできました");
		} else if (x >= 60 && x < 80) {
			System.out.println("よくできました");
		} else if (x < 60) {
			System.out.println("残念でした");
		}
		
		// ケース３
		if (x >= 80) {
			System.out.println("優");
		} else if (x >= 70 && x < 80) {
			System.out.println("良");
		} else if (x >= 60 && x < 70) {
			System.out.println("可");
		} else {
			System.out.println("不可");
		}
	}

}
