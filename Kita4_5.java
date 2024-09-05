package kita4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kita4_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				              new InputStreamReader( System.in));
		
		int sum = 0;
        for (int i = 0; i < 11; i++) {
        	int num = Integer.parseInt(br.readLine());
        	sum += num;
        
        }
        System.out.println(sum / 10);
        
	}

}
