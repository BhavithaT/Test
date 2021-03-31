package MavenSetup.flash;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Webelements 
{
	static excelutils excelUtils = new excelutils();
	//static String excelFilePath =Constants
	 
	    @FindBy(xpath="//button[contains(text(),'Click')]")
	    private WebElement l1;
	    
		@FindBy(xpath="/html/body/div[2]") 
		private WebElement para1;
		 
	    
	    @FindBy(xpath="//div[@id='edit']")
	    private WebElement para;
	    
	    @FindBy(xpath="//button[text()='Insert table']")
	    private WebElement insert;
	    
	   
	    
	    
	    public Webelements(WebDriver driver)
	    {
	    	PageFactory.initElements(driver, this);
	    }
	    public void text() throws InterruptedException
	    {
	    	Thread.sleep(1000);
	    	l1.click();
	    	//para.click();
	    	Thread.sleep(2000);
	    	para.sendKeys(Keys.ENTER);
	    	Thread.sleep(1000);
	    	para1.click();
	    	insert.click();
	    	
	    }
	    
}
