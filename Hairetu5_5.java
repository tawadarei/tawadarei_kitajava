package sukkirijava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Hairetu5_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				                new InputStreamReader(System.in));
	int value = Integer.parseInt(br.readLine());
	int binary[] = new int[16];//２で割り、商を2で割り続ける。余りが1か0
	
	for (int i = 15; i >= 0; i--, value /= 2) {
	    binary[i] = value % 2;
	    //value /= 2はforの()の中に書く
	}
	
	
	for (int i = 0; i < 16; i++) {
		System.out.print(binary[i]);
	}

	}

}
