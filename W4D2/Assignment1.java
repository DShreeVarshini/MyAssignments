package w4d2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://buythevalue.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[@class='product-image']/a")).click();
		driver.findElement(By.xpath("//div[@id='com-hextom-smartpushmarketing-modal-close-modal']")).click();
		
		driver.findElement(By.xpath("//input[@name='wk_zipcode']")).sendKeys("641047");
		driver.findElement(By.xpath("//input[@class='btn']")).click();
		driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
		
		
		

	}

}
