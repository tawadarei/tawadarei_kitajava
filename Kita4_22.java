package kita4;

public class Kita4_22 {

	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int z = x + y;
		for (int i = 0; i <= 1000; i++) {
		  System.out.print(x + ",");
		  x = y;
		  y = z;
		  z = x + y;
		}
	}

}
/* 解答
int     n1 = 0;
int     n2 = 1;
int     n3 = n1 + n2;

while( n1 <= 1000 )
{
    System.out.print( n1 + "," );

    n1 = n2;
    n2 = n3;
    n3 = n1 + n2;
}
*/