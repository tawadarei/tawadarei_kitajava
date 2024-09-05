package kita4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kita4_7 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				              new InputStreamReader(System.in));
		//思いつかなかった。チームが二つ→入れ物も二つ作る
		int giants = 0;
		int tigers = 0;
		
		for (int i = 1; i < 10; i++) {
		System.out.println(i + "回表、巨人の得点は？");
		int scoreg = Integer.parseInt(br.readLine());
		giants += scoreg;
		
		System.out.println(i + "回裏阪神の得点は？");
		int scoret = Integer.parseInt(br.readLine());
		tigers += scoret;
		}
		System.out.println("巨人: " + giants + "点、阪神: " + tigers + "点");
		if (giants > tigers) {
			System.out.println("巨人の勝ち");
		}else if (giants < tigers) {
			System.out.println("阪神の勝ち");
		}else {
			System.out.println("引き分けです");
		}
	}

}
