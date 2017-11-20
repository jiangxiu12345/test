package chapter7;

import java.util.Arrays;

public class ArrayInsert {

	public static void main(String[] args) {
		int[] arr = new int[6];
		arr[0]=1;
		arr[1]=3;
		arr[2]=5;
		arr[3]=7;
		arr[4]=9;
		
		System.out.println(Arrays.toString(arr));
		int pos =0;
		int insertVal = 6;
		//遍历数组，找到要出入的位置
		for(int i=0;i<5;i++){
			if(arr[i]>insertVal){
				pos = i;
				break;
			}
		}
		//把这个元素插入到数组中。
		//把该位置后面的元素都往后移一位。
		//把该位置的元素的值设置为要插入的值。
		for(int k=arr.length-1;k>pos;k--){
			arr[k]=arr[k-1];
		}
		arr[pos]=insertVal;
		System.out.println(Arrays.toString(arr));
	}
}

