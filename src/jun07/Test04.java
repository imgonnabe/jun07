package jun07;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		// 주민등록번호 뒷자리 첫숫자를 입력했을 때 남,여 판별하는 프로그램

		System.out.println("주민등록번호 뒷자리 첫숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		if (input % 2 == 0) {
			System.out.println("당신은 여자입니다.");
		} else {
			System.out.println("당신은 남자입니다.");
		}
		sc.close();
	}

}
