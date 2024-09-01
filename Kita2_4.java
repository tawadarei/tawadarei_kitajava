package kita2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kita2_4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				              new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);
	}

}
