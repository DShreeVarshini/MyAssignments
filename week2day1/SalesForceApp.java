package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForceApp {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		//WebDriver obj = driver.findElement(By.id("username"));
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		
		String title = driver.getTitle();
		System.out.println(title);

	}

}
