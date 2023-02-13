package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC Company");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shree Varshini");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Varshini");
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description for creating a lead");
		driver.findElement(By.name("primaryEmail")).sendKeys("sriharid98@gmail.com");
        
		WebElement stateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select selObj = new Select(stateDropDown);
		selObj.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.getTitle();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("XYZ Company");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari Nandhini");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());
	}

}
