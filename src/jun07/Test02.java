package jun07;

// 이름 만드는 방법, class, method, var, data type
// if, for
class AppleKorea{
//	public static void main(String[] args) {
//		System.out.println("Apple");
//	}
	public void apple() {
		System.out.println("사과입니다.");
	}
}
public class Test02 {

	// 메소드 속에 메소드가 들어갈까? x
	public static void ppp() {
		System.out.println("저는 ppp메소드 입니다.");
	}

	public static void main(String[] args) {
		int i = 100;// P타입
		String str = new String("R");// R타입(인스턴스 만들기)
		String str2 = "R";
		print();
		
		//AppleKorea 클래스 불러오기
		AppleKorea appleKorea = new AppleKorea();
		//클래스
		//메소드 실행하기
		appleKorea.apple();
	}
		public static void print() {
		ppp();// 호출은 가능
	}

}
