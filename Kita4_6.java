package kita4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kita4_6 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				              new InputStreamReader(System.in));
		System.out.println("0か1を入力してください");
		int count = 0;
		for (int i = 0; i <10; i++) {
			
		int result = Integer.parseInt(br.readLine());
          if (result == 0) {
        	  count++;
          }
        System.out.println("負けの総数は" + count);
        System.out.println("勝ちの総数は" + (10 - count));
		}


	
	}

}
