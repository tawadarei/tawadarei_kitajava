package kita4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kita4_15 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				              new InputStreamReader(System.in));
		/*解答
    for( n = 2 ; n <= ( value / 2 ) ; n++ ){
    if( ( value % n ) == 0 )
        break;
}

if( n > ( value / 2 ) )
    System.out.println( value + "は素数です" );
else
    System.out.println( value + "は素数ではありません" );*/
		int n = Integer.parseInt(br.readLine());
		int i = 0;
        boolean num = true;
		for (i = 4; i <= n; i++) {
		
		  if ((i % n )== 0) {
			  num = false;
			  break;
		   } 
		}
		 if (num && i > n) {
			 
		    System.out.println(n + "は素数ではない");
		    
	     }else {
	    	 System.out.println(n + "は素数です");
	     }
		 		  
		}
		
		
	}

//あってるのかわからん
/*数値かどうか判定する値をn、割る数をiとする
iが4から始まってn未満まで1ずつ増えていく繰り返しを設定する
↑の繰り返しの中でnをiで割った余りを求める
↑の余りが0なら素数ではないので繰り返しを終了する
　　余りが0でないなら繰り返しを続け、最後まで繰り返しても0にならなければ素数*/