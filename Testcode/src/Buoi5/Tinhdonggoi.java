package Buoi5;

public class Tinhdonggoi {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Tinhdonggoi tinh_donggoi = new Tinhdonggoi();

		tinh_donggoi.setName("aaaaa");
		System.out.println(tinh_donggoi.getName());
	}

}
