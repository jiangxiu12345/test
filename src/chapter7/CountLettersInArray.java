package chapter7;

import java.util.Arrays;

public class CountLettersInArray {
	public static void main(String args[]){
		char[] chars = new char[10];

		for (int i = 0; i < chars.length; i++) {
			chars[i] = (char) ('a' + Math.random() * ('z' - 'a' + 1));
		}
		// 显示字符数组
		System.out.println("随机生成的字符有:");
		System.out.println(Arrays.toString(chars));

		int[] counts = new int[26];
		int index =0;
		for (int i = 0; i < chars.length; i++) {
			index =chars[i] - 'a';
			counts[index]++;
		}
		System.out.println("每个字母出现的次数分别为:");
		for (int i = 0; i < counts.length; i++) {
			//if (counts[i] == 0)
			//	continue; // 0次不显示
			//每10个一行
			if ((i + 1) % 10 == 0){
				System.out.println((char) (i + 'a') + " " + counts[i]);
			}
			else{
				System.out.print((char) (i + 'a') + " " + counts[i] + ", ");
			}
		}
	}
}
