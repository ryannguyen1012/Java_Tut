package lab03;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào 1 số nguyên bất kỳ: ");
		int n = scanner.nextInt();

		if (n <= 1) {
			System.out.println(n + " không phải là số nguyên tố");
		} else {
			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					System.out.println("Ước số khác: " + i);
					isPrime = false;
					break;
				}
			}

			if (isPrime) {
				System.out.println(n + " là số nguyên tố");
			} else {
				System.out.println(n + " không là số nguyên tố");
			}
		}
		scanner.close();
	}
}
