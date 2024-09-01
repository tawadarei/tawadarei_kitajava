package kita3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kita3_13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				              new InputStreamReader(System.in));
		        System.out.println("何月ですか？");
				int month = Integer.parseInt(br.readLine());

				switch (month) {
				case 1, 3, 5, 7, 8, 10, 12 -> {
					System.out.println("31日");
				}
				case 2 -> {
					System.out.println("28日");
				}
				case 4, 6, 9, 11 -> {
					System.out.println("30日");
				}
				default -> {
					System.out.println("入力が間違っています");
				}
				}

	}

}
