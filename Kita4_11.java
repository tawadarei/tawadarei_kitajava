package kita4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kita4_11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				              new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		
		//
        for (int i = 0; i < count; i ++) {
    	  System.out.println(i % 10);
       }
	}	   	

}
/*
BufferedReader br = new BufferedReader(
                    new InputStreamReader(System.in));

int count = Integer.parseInt(br.readLine());
for (int i = 0, out = 0; i < count; i++) {
  System.out.print(out++);
}  
  if (out > 9) {
    out = 0;
  }
} */