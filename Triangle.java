package Kita6_4;

public class Triangle {
  public static void main(String[] args) {
    shapes(3);
    shapes(4);
    shapes(5);
    

  }
  public static void shapes(int x) {
    for (int i = 0; i < x; i++) {
        for (int j = 0; j <= i; j++) {
          System.out.print("$");
        }
        //何も戻さない
    
    System.out.println();
    }
  }
}
