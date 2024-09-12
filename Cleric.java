public class Cleric {
	String name;
	int hp = 50; 
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;
	
	public void selfAid() {
		System.out.println(this.name + "はセルフエイドを唱えた！");
		//↑練習８−３で書けなかった。
		this.hp = this.MAX_HP;
		this.mp -= 5;
		System.out.println("HPが最大まで回復した");
	}	
	public int pray(int sec) {
		//p.191 void空
		System.out.println(this.name + "は" + sec + "秒間天に祈った！");
		//p.93
		int r = new java.util.Random().nextInt(3) + sec;
		/*Math.min() は静的関数で、引数で渡されたもののうち最小の値を返す。
		 または引数のいずれかが数値以外で、数値に変換できない場合は NaN を返す。*/
	    int recoverActual = Math.min(this.MAX_MP - this.mp, r);
	    this.mp += recoverActual;
	    System.out.println("MPが" + recoverActual + "回復した");
	    return recoverActual;

	}
}