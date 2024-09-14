package Kita6_5;

public class Triangle2 {
    public static void main(String[] args) {
        triangle2(3, '#');
        triangle2(4, '$');
        triangle2(5, '%');
    }
    public static void triangle2(int size, char ch) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
 /* なんか全然違ったできなかった
   public static void main(String[] args) {
      int x = size(5);
    }
    public static int size(int x) {
      for(int i = 0; i < x; i++) {
        for(int j = 0; j <= i; j++){
            System.out.print(shapes('&'));
        }
        System.out.println();
      }

      return x;
    }
    public static void shapes(char a) {
      
    }*/
}
