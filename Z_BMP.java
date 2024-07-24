package test01;

import java.util.Scanner;
import java.lang.Math;

public class Z_BMP {

	public static void main(String[] args) {
		double chang;
		double kuan;
		double ans;
		double deep;
		double kb;
		double mb;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入长： ");
		chang = input.nextDouble();
		System.out.print("请输入宽： ");
		kuan = input.nextDouble();
		int col;
		int time = 1;
		int temp = 2;
		double se;
		System.out.print("请选择位色（1）或色（2）： ");
		col = input.nextInt();
		if(col == 1) {
			System.out.print("请输入位色： ");
			deep = input.nextDouble();
		}else {
			System.out.print("请输入色： ");
			se = input.nextDouble();
			while(temp != se) {
				temp = temp * 2;
				time++;
			}
			deep = time;
		}
		ans = 14 + 40 + chang * kuan * deep/8;
		kb = ans / 1024;
		mb = kb / 1024;
		System.out.println(kb+" kb");
		System.out.println(mb+" mb");

	}

}
