package kita3;

public class Kita3_6 {

	public static void main(String[] args) {
		int x = new java.util.Scanner(System.in).nextInt();
		if (x >= 0 && (x % 2 == 0)) {
		    System.out.println("xは正の偶数です");
		} else if ((x > 0) && (x % 2 == 1)) {
			System.out.println("xは正の奇数です");
		} else if (x < 0 && (x % 2 == 0)) {
			System.out.println("xは負の偶数です");
		} else if (x < 0 && (x % 2 ==1)) {
			System.out.println("xは負の奇数です");
		}
	}
}
// 解答は7～１４が
/*     if ((x % 2 ) == 0) {
 *       if(x >= 0) {
 *         System.out.println("正の偶数");
 *       } else {
 *         System.out.println("負の偶数");
 *       }
 *     else {
 *       if ( X >= 0) {
 *         System.out.println("正の奇数");
 *       } else {
 *         System.out.println("負の奇数");
 *       }
 *     } */