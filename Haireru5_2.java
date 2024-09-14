package sukkirijava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Haireru5_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (
				               new InputStreamReader(System.in));
		
		int[] ten = new int[10];
		for (int i = 0; i < 10; i++) {
		 ten[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 9; i > 0; i --) {
			System.out.println(ten[i]);
		}
	}

}
