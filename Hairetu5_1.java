package sukkirijava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Hairetu5_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (
				               new InputStreamReader(System.in));
		
		int[] ten = new int[10];
		for (int i = 0; i < 10; i++) {
		  ten[i] = Integer.parseInt(br.readLine());
		  //10個の数値を入力
		}System.out.println();
		for (int i = 0; i < 10; i++) {
		//入力された各々の数値を２倍にして表示
		System.out.println(ten[i] * 2);
		}
}
}