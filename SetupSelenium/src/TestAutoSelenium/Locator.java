package TestAutoSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Seleniumjava\\01.Tool\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// 1 - Maximize browser của mình
		driver.manage().window().maximize();

		// 2 - Đi đến 1 url

		driver.navigate().to("https://saleserpdemo.bdtask-demo.com/v10_demo/login");

		// 3 - Lấy Title và in ra console

		System.out.println(driver.getTitle());

		Thread.sleep(2000);
		// Đối tượng WebElement
		// click button Login
		// button, input, link, dropdown, dialog,header_PageInventory,...

		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("admin@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123456");
		
		WebElement button_Login = driver.findElement(By.cssSelector("button.btn.btn-success"));
		button_Login.click();
		
		Thread.sleep(2000);
		
		WebElement link_Sale = driver.findElement(By.linkText("Sale"));
		link_Sale.click();
		Thread.sleep(2000);
		WebElement button_Add_Customer = driver.findElement(By.cssSelector("a.client-add-btn[data-target='#cust_info'][aria-hidden='true']"));
		button_Add_Customer.click();
		
		Thread.sleep(2000);
		// Thoát hẳn Browser
		
		driver.quit();

	}

}
