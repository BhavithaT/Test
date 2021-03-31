package MavenSetup.flash;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class elements extends excelutils
{
WebDriver driver;
    
	@Test
    public void test() throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	driver.get("https://sps-share.s3-us-west-2.amazonaws.com/Itable.html");
    	driver.manage().window().maximize();
    	
    	Webelements a=new Webelements(driver);
    	a.text();
    }
	
    	
}
