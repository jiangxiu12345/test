package chapter7;
import java.util.Arrays;

public class TestArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = {5,3,99,7,0};

		System.out.println("排序前："+ Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("排序后："+ Arrays.toString(arr));
		
		int pos = Arrays.binarySearch(arr, 3);
		System.out.println("位置在："+pos);
	}

}
