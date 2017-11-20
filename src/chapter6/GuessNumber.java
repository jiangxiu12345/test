package chapter6;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		int number = (int)(Math.random()*101);
		System.out.println("请输入数字：");
		Scanner input = new Scanner(System.in);
		while(true){
			int guess = input.nextInt();
			if(guess>number){
				System.out.println("太大了");
			}else if(guess<number){
				System.out.println("太小了");
			}else{
				System.out.println("猜中了。");
				break;
			}
		}
	}
}
