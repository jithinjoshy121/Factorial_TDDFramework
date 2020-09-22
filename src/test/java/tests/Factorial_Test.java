package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import data.DataFile;
import pages.Factorial_page;


public class Factorial_Test extends TestBase{
	
	Factorial_page fp;
	DataFile df;

	public Factorial_Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@BeforeMethod
	  public void beforeMethod() throws Exception {
		initialization();
		fp=new Factorial_page();
		df=new DataFile();	

	  }
	
	@AfterMethod
	  public void afterMethod() {
		 closeBrowser();
	  }
	
	@Test
	 public void verifyTitle() throws InterruptedException 
	  {
		 
			Assert.assertEquals(fp.getTitle1(),df.title);
			
			
	  }
	
	@Test
	 public void verifyText() throws InterruptedException 
	  {
		 
		Assert.assertTrue(fp.webElementVerify(fp.text));
		Assert.assertEquals(fp.text.getAttribute("placeholder"), df.text1);
	  }
	
	@Test
	 public void verifyButton() throws InterruptedException 
	  {
		 
		Assert.assertTrue(fp.webElementVerify(fp.button));
		Assert.assertEquals(fp.button.getText(), df.text2);
		
	  }
	 
	@Test
	 public void verifyError() throws InterruptedException 
	  {
		 fp.button.click();
		Assert.assertEquals(fp.error(),df.error);
	  }
	
	@Test
	 public void verifyOutput() throws InterruptedException 
	  {
		fp.text.sendKeys("4"); 
		fp.button.click();
		Assert.assertEquals(fp.result.getText(),df.output);
	  }
	
	

}
