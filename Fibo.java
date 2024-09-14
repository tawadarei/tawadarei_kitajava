package Kita6_8;

public class Fibo {
    public static void main(String[] args) {
      for(int n= 11; n <= 20; n++) {
        System.out.print(fibo(n) + " ");
      }
    }
    public static int fibo(int n) {
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return 1;
        } else {
            return fibo(n - 2) +  fibo(n - 1);
        }
               

    }
}
//北ソフト練習問題4−２２を参考にしたけど、できなかった