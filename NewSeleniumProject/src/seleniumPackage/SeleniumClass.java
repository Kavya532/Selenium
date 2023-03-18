package seleniumPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Selenium\\browse drivers\\msedgedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://www.google.com");

	}

}
