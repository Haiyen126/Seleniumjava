package Buoi3;

public class Array {
public static void main(String[] args) {
	int arr[] = {11,12,13,14};
	int a[] = new int[3];
	a[0]= 10;
	a[1]= 20;
	a[2]= 30;
	
	for(int i = 0; i< a.length; i++) {
	System.out.println(a[i]);
}
	
	String b[] = new String[4];
	b[0]= "10";
	b[1]= "20";
	b[2]= "30";
	b[3]= "40";
	
	int n1 = Integer.valueOf(b[0]).intValue();// chuyển String sang int
	int n2 = Integer.valueOf(b[1]).intValue();
	
	System.out.println(n1+n2);
	
	
//	Nhập 1 mảng có 100 phần tử với giá trị 25
	
	int arr2[] = new int[100];
	
	for(int j = 0; j< arr2.length; j++) {
		arr2[j]= 25;
		System.out.println(arr2[j]);
	}
}
}
