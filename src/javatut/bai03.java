package javatut;

import java.util.Scanner;

public class bai03 {

	public static void main(String[] args) {

		System.out.println("run bai 03");

		Scanner scanner = new Scanner(System.in);

		System.out.println("canh cua hinh lap phuong: ");
		int canh = scanner.nextInt();

		double thetich = Math.pow(canh, 3);
		System.out.println(" the tich hinh lap phuong la: " + thetich);
	}
}
