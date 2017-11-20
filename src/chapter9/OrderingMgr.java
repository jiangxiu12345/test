package chapter9;
import java.util.Scanner;

public class OrderingMgr {
	public static void main(String[] args) {
		String[] dishNames = { "红烧带鱼", "鱼香肉丝", "时令鲜蔬" }; // 菜名
		double[] prices = { 38.0, 20.0, 10.0 };
		int chooseDish; // 用户点的菜的编号
		int number; // 用户点的份数
		int orderCount = 0; // 订单数量
		int goOnOrder; // 接受是否继续订餐：1需要 0不需要
		String dishName; // 菜名
		int dishOrderCount; // 菜的份数
		int chooseBack; // 输入0返回
		int dishIndex; // 菜品编号
		String userName;// 接受输入的用户名
		boolean flag = false;

		int[] orderDishs = new int[4]; // 用户订单-菜的编号
		int[] orderDishCount = new int[4]; // 用户订单-菜的分数
		String[] uName = new String[4];// 存放输入的用户名
		int states[] = new int[4]; //记录订单状态  0表示预定成功，1表示签收成功
		
		while (true) {	
			// 打印提示语
			System.out.println("欢迎使用“吃货联盟订餐系统”");
			System.out.println("****************************");
			// 打印功能主菜单
			System.out.println("1、我要订餐");
			System.out.println("2、查看餐袋");
			System.out.println("3、签收订单");
			System.out.println("4、删除订单");
			System.out.println("5、我要点赞");
			System.out.println("6、退出系统");
			System.out.println("****************************");

			// 提示用户输入功能选项
			System.out.println("请选择");
			Scanner input = new Scanner(System.in);
			int choose = input.nextInt();
			switch (choose) {
			case 1:
				System.out.println("***我要订餐***");
				System.out.println("请输入订餐人姓名：");
				userName = input.next();
				// 打印点菜菜名和价格
				System.out.println("序号" + "\t" + "菜名" + "\t" + "单价");
				for (int i = 0; i < dishNames.length; i++) {
					System.out.println("" + (i + 1) + "\t" + dishNames[i]
							+ "\t" + prices[i]);
				}
				do {
					System.out.println("请选择您要点的菜品编号:");
					chooseDish = input.nextInt();
					System.out.println("请选择您需要的份数:");
					number = input.nextInt();
					orderCount++;
					orderDishs[orderCount] = chooseDish;
					orderDishCount[orderCount] = number;
					System.out.println("您是否还要点菜:1需要/0不需要");
					goOnOrder = input.nextInt();
					if (1 == goOnOrder) {
						continue;
					} else {
						// System.out.println("不再需要了");
						flag = true;
						break;
					}
				} while (flag != true);
				// 打印订餐信息
				System.out.println("序号\t订餐人\t餐品信息");
				for (int j = 0; j < orderCount; j++) {
					dishIndex = orderDishs[j]; // 菜品编号
					uName[j] = userName;
					dishName = dishNames[dishIndex]; // 菜名
					dishOrderCount = orderDishCount[j + 1]; // 菜的份数
					String dishInfo = dishName + " " + dishOrderCount;
					System.out.println("" + (j + 1) + "\t" + uName[j] + "\t"
							+ dishInfo + "份" );
				}
				System.out.println("输入0返回：");
				chooseBack = input.nextInt();
				if (0 == chooseBack) {
					continue;
				}
				break;
			case 2:
				System.out.println("***查看餐袋***");
				// 打印订餐信息
				System.out.println("序号\t订餐人\t餐品信息");
				for (int j = 0; j < orderCount; j++) {		
					System.out.println("" + (j + 1) + "\t" + uName[j] + "\t"+dishNames[j]+"\t"+orderDishCount[j+1]+ "份");
				}
				System.out.println("输入0返回：");
				chooseBack = input.nextInt();
				if (0 == chooseBack) {
					continue;
				}
				break;
				
			case 3:
				System.out.println("***签收订单***");
				boolean isSignFind = false;
				System.out.println("请选择你要签收的订单序号：");
				
				break;
				
			case 4:
				System.out.println("***删除订单***");
				break;
				
			case 5:
				System.out.println("***我要点赞***");
				break;
				
			case 6:
				System.out.println("***退出系统***");
				System.out.println("谢谢使用！！！");
				break;
			}
			break;

		}

	}
}
