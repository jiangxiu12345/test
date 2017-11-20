package chapter6;

public class BD {

	public static void main(String[] args) {
		int a=8,b=12;
		int gc=0;
		
		int min=0;
		min = a<b?a:b;
		for(int i=2;i<=min;i++){
			if(a%i==0&&b%i==0){
				System.out.println("公约数:"+i);
				gc=i;
			}
		}
		System.out.println("最大公约数是:"+gc);

	}

}
