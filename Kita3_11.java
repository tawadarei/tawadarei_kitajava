package kita3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Kita3_11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(
				              new InputStreamReader(System.in));
		System.out.println("１～１２月までの月の数字を入力してください");		
		int month = Integer.parseInt(br.readLine());

        switch (month) {
        
        case 1 -> {
        	System.out.println("元日、成人の日");
        }
        case 2 -> {
        	System.out.println("建国記念の日");
        }
        case 3 -> {
        	System.out.println("春分の日");
        }
        case 4 -> {
        	System.out.println("昭和の日");
        }
        case 5 -> {
        	System.out.println("建国記念日、みどりの日、こどもの日");
        }
        case 7 -> {
        	System.out.println("海の日");
        }
        case 9 -> {
        	System.out.println("敬老の日、秋分の日");
        }
        case 10 -> {
        	System.out.println("体育の日");
        }
        case 11 -> {
        	System.out.println("文化の日、勤労感謝の日");
        }
        case 12 -> {
        	System.out.println("天皇誕生日");
        }
        case 6, 8 -> {
        	System.out.println("祝日はありません");
        }
        }
		
	}

}
