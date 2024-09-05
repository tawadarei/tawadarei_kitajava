package kita4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kita4_18 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(
				                new InputStreamReader(System.in));
		
		int sum = 0;
		for (; ;) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				break;
			}
			sum += n;
		}
		System.out.println(sum);
		  

	}

}
