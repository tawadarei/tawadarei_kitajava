package sukkirijava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Hairetu5_3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				                new InputStreamReader(System.in));
		
		int[] ten = new int[10];
		for(int i = 0; i < 10; i++) {
			  ten[i] = Integer.parseInt(br.readLine());
		}
		System.out.println("奇数は");
		for(int n: ten) {
			if ((n % 2) == 1) {
				  System.out.print(n + " ");
		    }	  
		}
		System.out.println(" ");
		//改行しないので↑を入れたけど
		//解答は”¥n偶数”　¥n　改行　教科書にもあったわ
		System.out.println("偶数は");
		for(int n: ten) {
			if ((n % 2) == 0) {
				  System.out.print(n + " ");
			}
		}	
	}
}
