package chapter7;

import java.util.Arrays;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//打印数组[1,2,3,4,5]，并将数组收尾和末位数组调换打印出来[5,2,3,4,1]
		int[] array = {1,2,3,4,5};
		System.out.println(Arrays.toString(array));
		
		int a = array[0];
		for(int i=1;i<array.length;i++){
			array[i-1]=array[i];
		}
		array[array.length-1]=a;
		for(int j=0;j<array.length;j++){
			
		}
		System.out.println(Arrays.toString(array));
	}

}
