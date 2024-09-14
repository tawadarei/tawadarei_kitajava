package Kita6_6;

public class Kuku {
    public static void main(String[] args) {
        for (int j = 1; j < 10; j++) {
            kuku(j);
        }
        
    }
    public static void kuku(int x) {
        for (int i = 1; i < 10; i++) {
          int ans = x * i;
          System.out.printf(" %2d", ans);
        }
        System.out.println();
    }
}
