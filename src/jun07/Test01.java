package jun07;

import java.util.Scanner;//api

public class Test01 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);
//		String num = sc.nextLine();
//		int Num = Integer.parseInt(num);
		int input = sc.nextInt();//입력 대기

		System.out.println("당신이 입력한 숫자는 " + input + "입니다.");
		System.out.println("2진법으로는 " + Integer.toBinaryString(input) + "입니다.");
		
		sc.close();//객체 닫기
	}

}
