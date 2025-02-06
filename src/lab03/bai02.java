package lab03;

import java.util.Scanner;

public class bai02 {
	public static void main(String[] args) {
		System.out.println("run bai 2!");
		Scanner scanner = new Scanner(System.in);
		System.out.println("nhap vao so nguyen: ");
		int n = scanner.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
}
