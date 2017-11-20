package chapter7;

import java.util.Scanner;

public class Demo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 练习while循环
		Scanner input = new Scanner(System.in);
		System.out.println("张浩现在学习合格吗？y/n");
		String answer = input.next();
		while(answer.equals("n")){
			System.out.println("上午看书，下午上级练习");
			System.out.println("张浩现在学习合格吗？y/n");
			answer = input.next();
		}

		System.out.println("程序结束！");
	}

}
