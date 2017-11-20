package chapter7;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] scores = {1,2,3,4,5};
		int len = scores.length;
		int sum=0;
		int score=0;
		
		System.out.println("len:"+len);
		for(int i=0;i<len;i++){
			score = scores[i];
			sum = sum + score;
		}
		System.out.println( "总分和平均分分别为：" + sum+","+ sum/len );
	}

}
