package Exim_pee;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://eximpe.com/#");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		Actions action = new Actions(driver);
		
		WebElement about = driver.findElement(By.xpath("//div[@class='elementor-widget-wrap elementor-element-populated']//a[text()='About']"));
		action.moveToElement(about).build().perform();
		
		WebElement about_exim =
		driver.findElement(By.xpath("//div[@class='elementor-widget-wrap elementor-element-populated']//ul//li[2]//a[text()='About EximPe']"));
	
		
		js.executeScript("arguments[0].click();", about_exim);
		
		WebElement Employee = driver.findElement(By.xpath("//div[@data-id='a5bffbd']//span"));
		
		String number = Employee.getText();
		
		System.out.println("Employees = "+number);
		driver.close();

	}

}
