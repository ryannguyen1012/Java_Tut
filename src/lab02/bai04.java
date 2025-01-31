package lab02;

import java.util.Scanner;

public class bai04 {
	public static void bai01() {
		Scanner scanner = new Scanner(System.in);

		int a, b;
		int x = 0;
		System.out.println("nhap vao so nguyen a: ");
		a = scanner.nextInt();
		System.out.println("nhap vao so nguyen b: ");
		b = scanner.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("phuong trinh vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("phuong trinh vo nghiem");
		} else {
			x = -b / a;
			System.out.println("nghiem x cua phuong trinh la: " + x);
		}
		scanner.close();

	}

	public static void bai02() {
		Scanner scanner = new Scanner(System.in);

		double a, b, c;
		double x, x1, x2;
		System.out.println("nhap vao so nguyen a");
		a = scanner.nextInt();
		System.out.println("nhap vao so nguyen b");
		b = scanner.nextInt();
		System.out.println("nhap vao so nguyen c");
		c = scanner.nextInt();

		if (a == 0) {
			System.out.println("phuong trinh vo so nghiem");
		} else if (a != 0) {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("phuong trinh vo nghiem");
			} else if (delta == 0) {
				x = -b / (2 * a);
				System.out.println("phuong trinh co nghiem kep: " + x);
			} else {
				x1 = (-b + Math.sqrt(delta)) / (2 * a);
				x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("phuong trinh co 2 nghiem rieng biet: ");
				System.out.println("nghiem 1: " + x1);
				System.out.println("nghiem 2: " + x2);
			}

		}
	}

	public static void bai03() {
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

	public static void main(String[] args) {
		System.out.println(">>LUA CHON TINH NANG<<");
		System.out.println("++------------------++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");
		int chon;
		Scanner scanner = new Scanner(System.in);
		chon = scanner.nextInt();
		switch (chon) {
		case 1:
			bai01();
			break;
		case 2:
			bai02();
			break;
		case 3:
			bai03();
			break;
		case 4:
			System.exit(chon);
		default:
			System.exit(chon);
		}
	}

}
