package w4d2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(driver.findElement(By.xpath("//a[text()='brands']"))).perform();
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("L'Oreal Paris",Keys.ENTER);
		builder.moveToElement(driver.findElement(By.xpath("(//div[@class='css-ov2o3v']//a)[6]"))).click().perform();
		//System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[@class=' css-n0ptfk']")).click();
		driver.findElement(By.xpath("//label[@for='radio_customer top rated_undefined']")).click();//toprated
		driver.findElement(By.xpath("(//div[@class='filter-open css-1kwl9pj'])[1]")).click();//category
		driver.findElement(By.xpath("(//div[@class=' css-b5p5ep'])[2]")).click();//hair
		driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();//haircare
		driver.findElement(By.xpath("//label[@for='checkbox_Shampoo_316']")).click();//shampoo
		driver.findElement(By.xpath("(//span[text()='Concern'])")).click();//concern
		driver.findElement(By.xpath("(//label[@for='checkbox_Color Protection_10764'])")).click();//colorprotection
		driver.findElement(By.xpath("//a[@class='css-qlopj4']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		String price = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
		System.out.println("Price - " + price);
		driver.findElement(By.xpath("//button[@class=' css-1qvy369']")).click();
		driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='css-acpm4k']"));
		driver.switchTo().frame(frame);
		String total = driver.findElement(By.xpath("(//p[@class='css-masf0q eka6zu20'])[2]")).getText();
		System.out.println("Grand Total - " + total);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		String netTotal = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']")).getText();
		if(total.equals(netTotal))
			System.out.println("Total displayed are the same");
		else
			System.out.println("Total displayed are not the same");
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		driver.quit();
		
		
	}

}
