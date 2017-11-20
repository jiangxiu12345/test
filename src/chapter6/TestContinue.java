package chapter6;

import java.util.Scanner;

public class TestContinue {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total=0;
		for(int i=0;i<5;i++){
			int score = input.nextInt();
			if(score<80){
				continue;
			}
			total++;
		}
		System.out.println("大于或等于80分的人数为："+total);
	}
}
