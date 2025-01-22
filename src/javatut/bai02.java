package javatut;

import java.util.Scanner;

public class bai02 {
	public static void main(String[] args) {
		System.out.println("run bai 02");

		Scanner scanner = new Scanner(System.in);

		System.out.println("chieu dai hinh chu nhat: ");
		int chieudai = scanner.nextInt();

		System.out.println("chieu rong hinh chu nhat: ");
		int chieurong = scanner.nextInt();

		float chuvi = (chieudai + chieurong) * 2;
		float dientich = chieudai * chieurong;
		int min = Math.min(chieudai, chieurong);

		System.out.println("chu vi hinh chu nhat: " + chuvi);
		System.out.println("dien tich hinh chu nhat: " + dientich);
		System.out.println("canh nho nhat hinh chu nhat: " + min);

	}
}
