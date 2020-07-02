package vn.t3h.ls2;

import java.util.Scanner;

public class Loop {

	public static void main(String[] arg) {
		int i = 10;
//		for (i = 0; i<5; i++) {
//			System.out.println("Thu Tu su so: " + i);
//		}
//		while(i<6) {
//			System.out.println("Thu Tu su so: " + i);
//			i ++;
//		}
		
//		do {
//			System.out.println("Thu Tu su so: " + i);
//			i++;
//		} while (i<5);
		// Loop.printStars(5);
		
		Loop.doWhile();
	}

	public static void printStars(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printStarsRevert(int n) {
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 2 * (n - i); j >= 0; j--) {
				System.out.print(" ");
			}
			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void printTriagle(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 1; j--) {
				System.out.print("" + i);
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
			if(i >= 2)
				break;
		}
	}

	private static void doWhile() {
		float sum = 0, number;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Nhập vào số:");
			number = scanner.nextFloat();
			sum += number;
			// nếu tổng lớn hơn 100 thì dừng
			if (sum > 100)
				break;
		} while (number > 60);
		System.out.println("Tổng = " + sum);
	}

	/*
	 * Định nghĩa : giai thừa của 1 số là tích các số liên tiếp từ 1 đến số đó.
	 * Trường hợp đặc biệt, giai thừa của 0 và 1 là 1. Ví dụ: giai thừa của 5 là
	 * 1*2*3*4*5 = 120
	 */
	public static long tinhGiaithua(int n) {
		long giai_thua = 1;
		if (n == 0 || n == 1) {
			return giai_thua;
		} else {
			for (int i = 2; i <= n; i++) {
				giai_thua *= i;
			}
			return giai_thua;
		}
	}
}