//switchを使うところからわからなかった。こうやってやるのか！！というレベルです。
//全然できませんでした
public class CoinCase {
    private int Y500 = 0;
    private int Y100 = 0;
    private int Y50 = 0;
    private int Y10 = 0;
    private int Y5 = 0;
    private int Y1 = 0;

    public void AddCoins(int kind, int count) {
      switch (kind){
        case 500 -> {
          Y500 += count;
        }
        case 100 -> {
          Y100 += count;
        }
        case 50 -> {
          Y50 += count;
        }
        case 10 -> {
          Y10 += count;
        }
        case 5 -> {
          Y5 += count;
        }
        case 1 -> {
          Y1 += count;
        }
      }
    }
    public int GetCount(int kind) {
        switch (kind) {
          case 500 -> {
            return Y500;
          }
          case 100 -> {
            return Y100;
          }  
          case 50 -> {
            return Y50;
          }
          case 10 -> {
            return Y10;
          }
          case 5 -> {
            return Y5;
          }
          case 1 -> {
            return Y1;
          }
          default -> {
            return 0; 
          }        
        } 
    }
    public int GetAmount() {
        return (Y500 * 500) + (Y100 * 100) +(Y50 * 50) +
           (Y10 * 10) + (Y5 * 5) + Y1;
    }


public static void main(String[] args) throws IOException {
    BufferReader br = new BufferReader(
                        new InputStreamReader(System.in));
  CoinCase c = new CoinCase();
  for (int i = 0; i < 10; i++) {
    System.out.print("硬貨の種類は？");
    int kind = Integar.parseInt(br.readLine());
    System.out.print("硬貨の枚数は？");
    int count = Integer.parseInt(br.readLine());

    c.AddCoins (kind, count)
  } 
  System.out.println("500円は" + c.GetCount(500) + "枚");
  System.out.println("100円は" + c.GetCount(100) + "枚");
  System.out.println("50円は" + c.Getcount(50) + "枚");
  System.out.println("10円は" + c.GetCount(10) + "枚");
  System.out.println("5円は" + c. GetCount(5) + "枚");
  System.out.println("1円は" + c.GetCount(1) +"枚");

  System.out.println("総額は" + c.GetAmount() + "円");

}
}





