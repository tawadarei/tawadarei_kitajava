package kita4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kita4_14 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				              new InputStreamReader(System.in));
		
		int strike = 0;
		int ball = 0;
		int faul = 0;
		
		while (strike < 3 && ball < 4) {
		  System.out.println("ストライク=1 or ボール= 2 or ファウル=3");
		
		  int n = Integer.parseInt(br.readLine());
		  if (n == 1) {
		    strike++;
		  } else if (n == 2) {
		    ball ++;
		  } else if (n == 3 && strike < 2) {
			strike++;
		    }
		  if ((strike + faul == 3) || ball == 4) {
		    System.out.println(ball + "ボール," + strike + "ストライク");  
		  }
		}
	}

}
