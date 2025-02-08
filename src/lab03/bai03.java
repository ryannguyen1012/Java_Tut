package lab03;

import java.util.Arrays;
import java.util.Scanner;

public class bai03 {
	public static void main(String[] args) {
		System.out.println("run bai 03");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so luong phan tu cua array: ");
		int size = scanner.nextInt();
		int[] a = new int[size];
		System.out.println("Nhap phan tu:");
		for (int i = 0; i < size; i++) {
			a[i] = scanner.nextInt();
		}
		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
//		System.out.println("max= " + a[a.length - 1]);
//		System.out.println("min= " + a[0]);
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			max = Math.max(max, a[i]);
		}
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			min = Math.min(min, a[i]);
		}

		System.out.println("max: " + max);
		System.out.println("min: " + min);
	}
}
