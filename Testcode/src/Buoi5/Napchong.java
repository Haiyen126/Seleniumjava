package Buoi5;

class Adder {
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
	static double add(double a, double b, double c) {
		return a + b + c;
	}
}

public class Napchong {
	public static void main(String[] args) {
		System.out.println(Adder.add(11, 12));
		System.out.println(Adder.add(11, 12, 14));
	}
}
