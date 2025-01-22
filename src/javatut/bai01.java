package javatut;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] args) {
		System.out.println("run bai 01");

		Scanner scanner = new Scanner(System.in);

		System.out.println("ten sinh vien: ");
		String name = scanner.nextLine();

		System.out.println("diem trung binh: ");
		int score = scanner.nextInt();

		System.out.println(name + " co diem = " + score);
		scanner.close();

	}
}
