package w4d2.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//span[@class='catText']"))).click(driver.findElement(By.xpath("//span[text()='Sports Shoes']"))).perform();
		String countOfShoes = driver.findElement(By.xpath("//div[@class='child-cat-count ']")).getText();
		driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
	    builder.moveToElement(driver.findElement(By.xpath("//span[text()='Sort by:']"))).click(driver.findElement(By.xpath("//span[text()='Sort by:']"))).click(driver.findElement(By.xpath("(//li[@class='search-li'])[1]"))).perform();
	    driver.findElement(By.xpath("(//input[@class='input-filter'])[1]")).clear();
	    driver.findElement(By.xpath("(//input[@class='input-filter'])[1]")).sendKeys("900");
	    driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).clear();
	    driver.findElement(By.xpath("(//input[@class='input-filter'])[2]")).sendKeys("1200");
	    //driver.findElement(By.xpath("//input[@checked='checked']/following-sibling::label[1]")).click();
	    driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
	    builder.moveToElement(driver.findElement(By.xpath("//a[@class='dp-widget-link hashAdded']"))).click(driver.findElement(By.xpath("//div[@pogid='621868725223']"))).perform();
	    String price = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
	    System.out.println("Price - " + price);
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("Discount - " + discount);
		driver.findElement(By.xpath("//div[@class='close close1 marR10']")).click();
		driver.close();
		
		
	}

}
