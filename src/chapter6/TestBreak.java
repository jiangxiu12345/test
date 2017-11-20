package chapter6;

public class TestBreak {

	public static void main(String[] args) {
		int sum  =0;
		for(int i=0;i<10;i++){
			sum = sum + i;
			if(sum>20){
				System.out.println("当前数字为："+i);
				break;
			}
		}
		System.out.println("和为："+sum);
	}

}
