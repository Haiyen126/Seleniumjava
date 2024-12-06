package p_hlw;



public class HLW {
	
	public String name = "HY"; // Biến toàn cục ( intance)
	public static String nameString = "HY"; // Bien static
	
	String name1 = "Hy1";
	int age = 10;// Biến cục bộ ( local)
	String date = "12/06/2000";
	float weight = 50.6f;
	Boolean sex = true;

	public void getInfo() {
		
		System.out.println(name1 +" "+ age + " "+ date + " "+ weight);
		}
		
	public static void main(String[] args) {
		System.out.println("Hello team Automation Testing");
//		System.out.println(nameString);
		HLW info = new HLW();
		info.getInfo();
	}
}
