package day1;

public class Main2 {

	public static void main(String[] args) {
		f();
		float f = 1.2f;
	}

	public static void f(int i) {
		System.out.println('7');
		if (i < 6) {
			System.out.println('5');
			f(i + 4);  //6
		}
		System.out.println(i);
	}

	public static void f() {
		System.out.println('3');
		f(2);
		System.out.println('1');
	}
}
// 3 7 5 7 6 2 1