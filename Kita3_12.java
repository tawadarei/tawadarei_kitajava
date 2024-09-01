package kita3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kita3_12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				              new InputStreamReader(System.in));
		System.out.println("鮨占い！好きなお寿司は何ですか");
		System.out.println("1= まぐろ, 2= えび, 3= こはだ, 4= いくら, 5= うに");
		int sushi = Integer.parseInt(br.readLine());

		switch (sushi) {
		case 1 -> {
			System.out.println("ラッキー");
		}
		case 2, 3 -> {
			System.out.println("いいことあるかも！");
		}
		case 4 -> {
			System.out.println("忘れ物に気を付けて！");
		}
		case 5 -> {
			System.out.println("うーん...");
		}
		}
	}

}
