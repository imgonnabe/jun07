package jun07;

public class Test07 {
	public static void main(String[] args) {

		char id = 'A';
		char input = 'a';

		System.out.println(id == input);

		// String 클래스는 같은 값이 있으면 동일한 값을 저장한다.
		// String은 변경 불가능한 값을 저장한다. > 메모리 위치를 바꾼다.
//		String str = "admin";
//		String str2 = "admin";
		String str = new String("admin");
		String str2 = new String("admin");
		//            ~~~
//		str = "111";
//		str = "admin";// str2를 바라본다.
		// 참조타입에서는 값 비교가 아니라 객체비교
		System.out.println(str == str2);// true > false
	}

}
