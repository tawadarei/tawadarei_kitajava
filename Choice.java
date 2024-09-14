package Kita6_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Choice {
  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(
                            new InputStreamReader(System.in));
    int x = Integer.parseInt(br.readLine());
    int y = Integer.parseInt(br.readLine());
    int z = Integer.parseInt(br.readLine());
    int ans = (maxint(x,maxint(y, z)));
    System.out.println(ans);
  }
  public static int maxint(int num1, int num2) {
    int ans = Math.max(num1, num2);
    return ans;
  }
}