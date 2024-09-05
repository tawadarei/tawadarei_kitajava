package kita4;

public class Kita4_3 {

	public static void main(String[] args) {
	  
	  int x = 1;	
	  for (int i = 1; i < 9; i++) {
	    x *= 2;
		System.out.println("2の" + i + "乗は" + x);
	  }

	}

}
//x *= 2 がでてこなかった。forの前にint x = 1 じゃないと全部2
