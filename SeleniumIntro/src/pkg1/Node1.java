package pkg1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Node1
{
	@Test
	public void tc1() throws MalformedURLException
	{
	   DesiredCapabilities cap=DesiredCapabilities.firefox();

	   RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
	   driver.get("https://www.facebook.com");
	   System.out.println("page title is "+driver.getTitle());
	}
	
}
