package jun07;

public class Test10 {
	public static void main(String[] args) {
		// fizz buzz
		for (int i = 1; i <= 25; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print("fizzbuzz");
			} else if (i % 3 == 0) {
				System.out.print("fizz");
			} else if (i % 5 == 0) {
				System.out.print("buzz");
			} else {
				System.out.print(i);
			}
			if (i == 25) {
				break;
			}
			System.out.print(", ");
		}
	}

}
