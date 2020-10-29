package inflearn;

public class Code01 {
	
	static int num;

	public static void main(String[] args) {
		int anotherNum = 5;
		num = 2;
		System.out.println(num + anotherNum);
		System.out.println(num);
		System.out.println(anotherNum);
	}

}
//하나의 프로젝트에 각각자신의 메인함수를 가지고있어도 어떤 메인함수를 실행할건지만 알려주면됌.
