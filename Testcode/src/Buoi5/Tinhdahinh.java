package Buoi5;
class Bike{
	void run() {
		System.out.println("Chạy bộ");
	}
	
}
public class Tinhdahinh extends Bike{
	void run() {
		System.out.println("Chạy khoảng 40km/h");
	}
	void stop() {
		System.out.println("stop");
	}
	public static void main(String[] args) {
		Bike bk = new Tinhdahinh();
		bk.run();// vi hàm nay trùng với hàm trên lớp cha là Bike 
		bk.stop();// không liên quan đến tk cha nên k gọi được 
		
		Tinhdahinh tdh = new Tinhdahinh();
		tdh.run();
		tdh.stop();
		
	}

}
