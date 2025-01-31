
package lab02;

import java.util.Scanner;

public class bai02 {
	public static void main(String[] args) {
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

}
