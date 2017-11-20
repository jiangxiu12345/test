package chapter7;

import java.util.Arrays;

public class Demo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 在数组[1,3,7,9]里面插入数字6，按大小顺序插入
		int[] arr= new int[]{1,3,7,9};
		int pos = 0;
		int insertVal = 6;
		
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++){
			if(arr[i]>insertVal){
				pos=i;
				break;
			}
		}
		for(int j=arr.length-1;j>pos;j--){
			arr[j]=arr[j-1];
		}
        arr[pos]=insertVal;
        System.out.println(Arrays.toString(arr));
	}

}
