package sukkirijava;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Hairetu5_4 {
	public static void main(String[]args) throws IOException {
		BufferedReader br = new BufferedReader(
				                new InputStreamReader(System.in));
		int[] ten = new int[10];
		int sum = 0;
		for (int i = 0; i < 10; i++) {
		ten[i] = Integer.parseInt(br.readLine());
	    sum += ten[i];
	    if(sum >= 100) {
	    	break;
	    } else if (sum < 100 && i == 9) {
	    
	    
		}
		}
		System.out.println(sum);
}
}
/*BufferedReader br = new BufferedReader(
                        new InputStreamReader( System.in ) );
  int values[] = new int[10];
  int cnt, sum;

  for( cnt = 0, sum = 0 ; cnt < 10 && sum <= 100 ; cnt++ )
  {
    values[cnt] = Integer.parseInt( br.readLine() );
    sum += values[cnt];
  }

  for( int i = 0 ; i < cnt ; i ++ )
    System.out.print( "\n" + values[i] );
*/