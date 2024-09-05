package kita4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kita4_16 {

	public static void main(String[] args)throws IOException {
	BufferedReader br = new BufferedReader(
			                new InputStreamReader (System.in));
	 String s = br.readLine();//こんな風に書けるなんて感動
	 int n = Integer.parseInt(s);
	 for (int i = 2; n > 1; i++) {
		 while ((n % i) == 0) {
			 System.out.print(i + " ");
			 n /= i;
		 }
	 }
	}
}

/*int num = 2489;

System.out.print(num+"=");

for (int i = 2;i<=num;i++) {

if (num % i == 0) {

num /= i;

if (num == 1) System.out.print(i);

else System.out.print(i + "×");

i = 1;

}*/