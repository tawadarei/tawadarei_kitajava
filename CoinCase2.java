import java.io.*;
public class CoinCase2 {
    
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
    public int GetCount() {
        return (Y500 + Y100 + Y50 + Y10 + Y5 + Y1);
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
    public int GetAmount(int kind) {
        switch(kind) {
            case 500 -> {
                return Y500 * 500;
            }
            case 100 -> {
                return Y100 * 100;
            }
            case 50 -> {
                return Y50 * 50;
            }
            case 10 -> {
                return Y10 * 10;
            }
            case 5 -> {
                return Y5 * 5;
            }
            case 1 -> {
                return Y1;
            }
            default -> {
                return 0;
            }
        }
    }
public static void main(String[] args) throws IOException {
  BufferedReader br = new BufferedReader(
                       new InputStreamReader(System.in));
  CoinCase2 case2 = new CoinCase2();
  
  for (int i = 0; i < 10; i++) {

  System.out.println("硬貨の種類は？");
  int kind = Integer.parseInt(br.readLine());
  System.out.println("硬貨の枚数は？");
  int count = Integer.parseInt(br.readLine());
  case2.AddCoins(kind,count);
  }
  System.out.println("500円が" + case2.GetCount(500) + "枚、" +
                     case2.GetAmount(500) + "円");

  System.out.println("100円が" + case2.GetCount(100) + "枚、" +
                     case2.GetAmount(100) + "円");

  System.out.println(case2.GetCount(50) + "枚、" +
                     case2.GetAmount(50) + "円、");

  System.out.println(case2.GetCount(10) + "枚、" +
                     case2.GetAmount(10) + "円、");

  System.out.println(case2.GetCount(5) + "枚、" +
                     case2.GetAmount(5) + "円");

  System.out.println(case2.GetCount(1) + "枚" +
                     case2.GetAmount(1) + "円");

  System.out.println("硬貨の総数は" + case2.GetCount() + "枚" +
                     "総額は" + case2.GetAmount() + "円");

}
}
//7-5参考にした。
//参考にしてるけど、こんな長いコードを自分で書いた気分になれて感動。