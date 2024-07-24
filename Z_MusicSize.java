package test01;

import java.util.Scanner;

public class Z_MusicSize {

	public static void main(String[] args) {
		double hz;
		double wei;
		double tun;
		double time;
		double b;
		double kb;
		double mb;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入采样频率（kHz): ");
		hz = input.nextDouble();
		hz = hz * 1000;
		System.out.print("请输入位数： ");
		wei = input.nextDouble();
		System.out.print("请输入声道（单声道1，立体声2）： ");
		tun = input.nextDouble();
		System.out.print("请输入时间(s)： ");
		time = input.nextDouble();
		b = hz * wei * tun * time / 8 + 44;
		kb = b / 1024;
		mb = b / 1024 / 1024;
		System.out.println(kb+" kb");
		System.out.println(mb+" mb");
		
	}

}
