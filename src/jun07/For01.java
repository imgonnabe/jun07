package jun07;

//별찍기
//응용sw 기초기술 활용
public class For01 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");// alt+화살표: 이동
			}
			System.out.println("");
		}

		for (int i = 5; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");// alt+화살표: 이동
			}
			System.out.println("");
		}

//		for (int i = 0; i < 5; i++) {
//			for (int j = 4; j >= i; j--) {
//				System.out.print("jⓐ"+j+" ");
//				}
//			for (int j = 0; j <= i; j++) {
//				System.out.print("jⓑ"+j+" ");
//			}
//			System.out.println("i"+i);
//		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 4; j > i; j--) {
				System.out.print("_");
				}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}


	}
}

				