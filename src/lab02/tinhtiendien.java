package lab02;

import java.util.Scanner;

public class tinhtiendien {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao tien dien: ");
		int dien = 0;
		dien = scanner.nextInt();
		if (dien <= 100) {
			System.out.println("giá điện là:" + dien * 1000);
		} else {
			System.out.println("giá điện là: " + 100 * 1000 + (dien - 100) * 1500);

		}
	}

}
