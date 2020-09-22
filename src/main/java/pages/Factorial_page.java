package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class Factorial_page extends TestBase{
	
	@FindBy(xpath="//input[@id='number']")
	public static WebElement text;
	
	@FindBy(xpath="//button[@id='getFactorial']")
	public static WebElement button;
	
	@FindBy(xpath="//p[@id='resultDiv']")
	public static WebElement result;

	public Factorial_page() {
		PageFactory.initElements(driver, this);
	}
	
	public String getTitle1()
	{
		
		return driver.getTitle();
		
	}
	
	public boolean webElementVerify(WebElement w)
	{
		
		return w.isDisplayed();
		
	}
	
	public String error()
	{
		
		return result.getText();
		
	}
	
	
	
	

}
