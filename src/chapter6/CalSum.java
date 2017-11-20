package chapter6;

import java.util.Scanner;

public class CalSum {
	public static void main(String[] args) {
		int sum =  0;
		for(int i=0;i<5;i++){
			int score=0;
			Scanner input = new Scanner(System.in);
			score = input.nextInt();
			sum =  sum+ score;
		}
		int avg = sum/5;
		System.out.println("你的总分是："+sum + ",平均分为：" + avg);
	}

}
