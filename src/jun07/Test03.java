package jun07;

public class Test03 {
	public static void main(String[] args) {
		boolean bool = !(1 + 1 == 3);
		int number = 10;
		if (number < 5 && bool) {
			System.out.println("참일 때 실행합니다.");
		} else {
			System.out.println("거짓일 때 실행합니다.");
		}
	}
}
