package jun07;

public class Test08 {
	public static void main(String[] args) {
		// 1 ~ 10까지 출력 > 1~10까지 모든 숫자를 더하면?
		int sum = 0;
		// 여기서 짝수만 더하면?
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		for (int i = 1; i % 2 == 0 && i < 11; i++) {
			sum += i;
		}

		System.out.println(sum);
	}

}
