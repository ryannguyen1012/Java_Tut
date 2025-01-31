package javatut;

import java.util.Scanner;

public class tinhthue {
	/*
	 * public static void main(String[] args) { Scanner scanner = new
	 * Scanner(System.in);
	 * 
	 * System.out.println("nhap vao so tien thue: "); int money = scanner.nextInt();
	 * if (money < 10000000) { System.out.println("khong dong thue"); } else if
	 * (10000000 <= money && money <= 15000000) { System.out.println("thue 10%"); }
	 * else if (money > 15000000 && money <= 30000000) {
	 * System.out.println("thue 20%"); } else { System.out.println("thue 50%"); }
	 * scanner.close();
	 * 
	 * }
	 */
	/*
	 * public static void main(String[] args) {
	 * 
	 * int day = 4; switch (day) { case 1: System.out.println("Monday"); break; case
	 * 2: System.out.println("Tuesday"); break; case 3: System.out.println("Wed");
	 * break; case 4: System.out.println("Thur"); break; case 5:
	 * System.out.println("Friday"); break; case 6: System.out.println("Saturday");
	 * break; case 7: System.out.println("Sunday"); break;
	 * 
	 * default: System.out.println("dont nkow"); } }
	 */
	public static void main(String[] args) {
		System.out.println("-----lua chon tinh nang----");
		System.out.println("++-------------------------++");
		System.out.println("1.Cong");
		System.out.println("2.Tru");
		System.out.println("3.ket thuc");
		Scanner scanner = new Scanner(System.in);
		System.out.println("lua chon cua ban la: ");
		int chon = scanner.nextInt();
		switch (chon) {
		case 1:
			System.out.println("cong");
			break;
		case 2:
			System.out.println("tru");
			break;
		case 3:
			System.out.println("ban da lua chon thoat chuong trinh");
			System.exit(0);

		default:
			System.out.println("dont nkow");
			;
		}

		scanner.close();
	}

}
