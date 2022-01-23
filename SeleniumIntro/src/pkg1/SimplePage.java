package pkg1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SimplePage
{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","../SeleniumIntro/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	//driver.manage().window().maximize();
	Options op=driver.manage();
	Window w=op.window();
	w.maximize();
	
	WebElement createAccount=driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
	createAccount.click();
	Thread.sleep(3000);
	WebElement month=driver.findElement(By.id("month")); // drop down
	Select s=new Select(month);
	s.selectByValue("8");	
	WebElement year=driver.findElement(By.id("year"));
	obj.dropDownSelectionByIndex(year,12);
	
	}

}
