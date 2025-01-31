package lab02;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] args) {
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

}
