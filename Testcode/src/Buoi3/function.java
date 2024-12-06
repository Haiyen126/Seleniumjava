package Buoi3;


public class function {
	static void Inputdata(int arr[], int a) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a;
		}
	}

	static void Printdata(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	protected void msg() {
		System.out.println("protected");
	}

	public static void main(String[] args) {
		int arr1[] = new int[10];
		int arr2[] = new int[5];
		Inputdata(arr1, 4);
		Printdata(arr1);
		Inputdata(arr2, 6);
		Printdata(arr2);

	}

}
