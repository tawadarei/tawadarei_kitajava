package sukkirijava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Hairetu5_6 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(
				                new InputStreamReader(System.in));
//System.out.printfを使用する。
//System.out.printf(" %2d", x );のように、%2dと記述すると表示が2桁に揃う。
        int[][] kuku = new int[9][];
        //int[][] 行、列の順
        for (int i = 0; i < 9; i++) {
        	kuku[i] = new int[9];
        	for (int j = 0; j < 9; j++) {
        		kuku[i][j] = (i + 1) * (j + 1);
        	}
        }
        for (int i = 0; i < 9; i++) {
        	for(int j = 0; j < 9; j++) {
        		System.out.printf(" %2d", kuku[i][j]);
        	}
        	System.out.println();
        }
	}
}

//全然できなかった
	
