package chapter6;
import java.util.Scanner;

public class CheckUser {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i = 3;//控制用户登陆的次数
		//用户登陆验证方法，只有三次机会
		while(true){
			System.out.println("请输入您的用户名：");
			String usename = input.next();
			System.out.println("请输入您密码：");
			String password = input.next();
			if("admin".equals(usename) && "admin".equals(password)){
				System.out.println("恭喜您，已成功登陆");
				break;
			}else{
				i--;
				if(i == 0){
					System.out.println("对不起，您输入的次数过多，请稍后重试");
					break;
				}
				System.out.println("对不起，您输入的密码或者用户名不正确。\n您还有"+i+"次机会，请重新输入!\n");
			}
		}
	}
}
