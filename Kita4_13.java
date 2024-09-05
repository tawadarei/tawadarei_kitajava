package kita4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kita4_13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				              new InputStreamReader(System.in));
		
		int scount = 0;
		int bcount = 0;
		while (scount < 3 && bcount < 4) {
		System.out.println("ストライク=1 or ボール=2 ?");
		int n = Integer.parseInt(br.readLine());
		  if (n ==1) {
			  scount++;
		  }else if (n == 2) {
			  bcount++;
		  }
		System.out.println(bcount + "ボール" + scount + "ストライク");
		}
	}

}
