package javatut;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("so thu nhat: " + Math.pow(2, 3));
		int so1 = scanner.nextInt();

		System.out.println("so thu hai: ");
		int so2 = scanner.nextInt();

		System.out.println("Max la: " + Math.max(so1, so2));
		scanner.close();
	}
}
