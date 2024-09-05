package kita4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kita4_12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				              new InputStreamReader(System.in));
		
		int sum = 0;
		while (sum <= 100) {
		int n = Integer.parseInt(br.readLine());
		sum = sum + n;
	    }
		System.out.println("合計は" + sum);
	}

}
//for文でbreak;を使うのかと思ってたらできなかった。違った。