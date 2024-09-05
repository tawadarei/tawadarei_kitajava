package kita4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kita4_8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				              new InputStreamReader(System.in));
		System.out.println("正の整数を10回入力してください");
		
		int max = 0;
        for (int i = 0; i < 10; i++) {
          int x = Integer.parseInt(br.readLine());
          if (x > max) {
        	  max = x;
          }
        }
        System.out.println("最大値は" + max);
	}

}
