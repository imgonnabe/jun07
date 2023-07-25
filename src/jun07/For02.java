package jun07;

public class For02 {
	public static void main(String[] args) {
/*
 * 
 ____*     41
 ___***    33
 __*****   25
 _*******  17
 ********* 09	
 */
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("_");
				}
			for (int j = 0; j <= i * 2; j++) {
				System.out.print("*");
				}
			System.out.println("");
		}
		
/*
 1 2 3
 4 5 6
 7 8 9
 */
		for (int i = 1; i < 10; i++) {
			if (i % 3 == 0) {
				System.out.print(i + "\n");
			} else {
				System.out.print(i + " ");
			}
		}
		
/*
 ___*   31
 __***  23
 _***** 15
 __***  23
 ___*   31
 */
		for (int i = 0; i < 3; i++) {
			for (int j = 3; j > i; j--) {
				System.out.print("_");
			}
			for (int j = 0; j <= 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j <= i + 1; j++) {
				System.out.print("_");
			}
			for (int j = 3; j > 2 * i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
