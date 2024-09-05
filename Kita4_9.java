package kita4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kita4_9 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				              new InputStreamReader(System.in));
	    int max = 0;
	    int mini = 0;
	    System.out.println("整数を１０回入力してください");
	    for (int i = 0; i < 10; i ++) {
	    
		  int x = Integer.parseInt(br.readLine());
          if (i == 0) {
        //i=0のときがなくて、最小値が常に0になってしまった
        	  max = x;
        	  mini = x;
          }else if (x < mini) {
        	  mini = x;
          }else if (x > max) {
        	  max = x;
          }
          
	    }
          System.out.println("最大値は" + max +",最小値は" + mini);
	}

}
