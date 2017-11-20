package chapter7;

import java.util.Arrays;

public class ArrayConvert {


	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		int temp = arr[0];
		for(int i=1;i<arr.length;i++){
			arr[i-1] = arr[i];
		}
		arr[arr.length-1] = temp;
		//打印数组中的内容
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
		//System.out.println(Arrays.toString(arr));
	}
}
