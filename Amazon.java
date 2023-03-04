package w4d1.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("oneplus 9 pro ",Keys.ENTER);
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		//System.out.println(price);
		String rating = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("Ratings - " + rating);
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(windowHandles);
		driver.switchTo().window(list.get(1));
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		String cartSubTotal = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
		if (price.equals(cartSubTotal))
			System.out.println("Verified and the price is correct");
		else
			System.out.println("Verified and the price is wrong");
		driver.close();
		
 
	}

}
