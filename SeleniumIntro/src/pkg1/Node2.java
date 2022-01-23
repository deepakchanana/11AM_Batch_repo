package pkg1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node2
{
	@Test
	public void tc1() throws MalformedURLException
	{
	   DesiredCapabilities cap=DesiredCapabilities.chrome();

	   RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	   driver.get("https://www.google.com");
	   System.out.println("page title is "+driver.getTitle());
	}
	
}
