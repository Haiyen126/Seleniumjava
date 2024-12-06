package Buoi4;

import java.util.Scanner;
class Student {
	String name;
	int age;

	public void display() {
		System.out.println(name + age);
	}

	public void getInformation() {
		Scanner sc = new Scanner(System.in);
		name = sc.next();
		age = sc.nextInt();
	}

}

public class BT1 {

	public static void main(String[] args) {

		Student st1 = new Student();
		st1.getInformation();
		st1.display();

	}

}
