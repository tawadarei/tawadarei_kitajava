package kita4;

public class Kita4_4 {

	public static void main(String[] args) {
	  int x = 1;
	  for (int i = 2; i < 8; i++) {
	//int i = 2 も、x *= iも考えては無理だった。
		x *= i;
		System.out.println("7の階乗は" + x);
	  }

	}

}
