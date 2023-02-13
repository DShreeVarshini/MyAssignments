package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchApp {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();//Launch browser
		driver.get("https://facebook.com");//Opens link
		EdgeDriver driver1 = new EdgeDriver();
		driver1.get("https://google.com");

	}

}
