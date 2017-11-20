package chapter6;

public class HookRabbit {

	public static void main(String[] args) {
		int rabbit=0;
		int hook=0;
		int foot=0;
		
		for(rabbit=0;rabbit<35;rabbit++){
			hook = 35-rabbit;
			foot = 2*hook + 4*rabbit;
			if(94==foot){
				System.out.println("鸡和兔的数量分别是："+ hook + " " + rabbit);
				break;
			}
		}
	}

}
