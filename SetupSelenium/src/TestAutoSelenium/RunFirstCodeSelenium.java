package TestAutoSelenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunFirstCodeSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjava\\01.Tool\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 //1 - Maximize browser của mình
        driver.manage().window().maximize();

        //2 - Đi đến 1 url
        
        driver.navigate().to("https://anhtester.com");

        //3 - Lấy Title và in ra console
        
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        // Thoát hẳn Browser

        driver.quit();
	}

}