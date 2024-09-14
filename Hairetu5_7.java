package sukkirijava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Hairetu5_7 {
  public static void main(String[] args) throws IOException {
     BufferedReader br = new BufferedReader(
    		                 new InputStreamReader(System.in));
     int[][] kuku = new int[9][9];
     for (int i = 1; i < 10; i++) {
    	 for (int j = 1; i < 10; j++) {
    		 kuku[i][j] = i * j;
    	 }
     }
     int p = Integer.parseInt(br.readLine());
     int q = Integer.parseInt(br.readLine());
     System.out.println(kuku[p][q]);
}
}