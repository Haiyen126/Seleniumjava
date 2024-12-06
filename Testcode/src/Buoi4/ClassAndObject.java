package Buoi4;

class TestClass {
	public int number1 = 10;
	public int number2 = 20;

	public int Cong(int a, int b) {
		return a + b;
	}

	public void Print(int a, int b) {
		System.out.println(Cong(a, b));
	}
}

public class ClassAndObject {
	public static void main(String[] args) {
		// Khởi tạo 1 dối tượng (object) thuộc 1 class
		TestClass obClass = new TestClass();
		obClass.Print(obClass.number1, 2);
	}

}
