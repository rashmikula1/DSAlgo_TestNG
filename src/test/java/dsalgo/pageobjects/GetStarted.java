package dsalgo.pageobjects;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import dsalgo.base.BaseClass;

import dsalgo.utility.Screenshot;

public class GetStarted extends BaseClass {
	private static Logger log= LogManager.getLogger(GetStarted.class);
	By gtStarted= By.xpath("//button[text()='Get Started']");
	By register= By.xpath("//a[text()=' Register ']");

	By signin= By.xpath("//a[text()='Sign in']");

	By username= By.xpath("//input[@id='id_username']");
	By password= By.xpath("//input[@id='id_password1']");
	By password1= By.xpath("//input[@id='id_password2']");
	By register2= By.xpath("//input[@value='Register']");
	By dropdown= By.xpath("//a[@class='nav-link dropdown-toggle']");
	By array=By.xpath("//a[text()='Arrays']");
	By alert= By.xpath("//div[@class='alert alert-primary']");

	By datastructclick= By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[1]/div/div/a");
	By seldrop=By.xpath("//div[@class='nav-item dropdown']/a");
	By selitem= By.xpath("//div[@class='dropdown-menu show']/a");


    public void getstart()
	{
		driver.findElement(gtStarted).click();


	}
	public void selectarray() throws IOException
	{
		driver.findElement(dropdown).click();
		driver.findElement(array).click();
		String text=driver.findElement(alert).getText();
		//takesScreenshot("alert");
		
		Screenshot.takesScreenshot("alert");


		log.info("The error"+ text);


	}
	public void clickdatastructure()
	{
		driver.findElement(datastructclick).click();;
		String text=driver.findElement(alert).getText();
		System.out.println("The alert message is "+ text);
	}
	public void selctany() throws InterruptedException
	{
		for(int i=1;i<=6;i++)
		{
			Thread.sleep(1000);
			driver.findElement(seldrop).click();
			driver.findElement(By.xpath("//div[@class='dropdown-menu show']/a["+i+"]")).click();
			String text=driver.findElement(alert).getText();
			System.out.println("The alert message is "+ text);

		}
	}
	public void validatesignin()
	{
		driver.findElement(signin).click();;

	}
	public void validateregister()
	{
		driver.findElement(register).click();;
	}

	public void clickRegister() throws IOException, InterruptedException
	{
		driver.findElement(register).click();;
		driver.findElement(register2).click();;
		Thread.sleep(1000);
		Screenshot.takesScreenshot("RegisterError");
        driver.findElement(username).sendKeys("roseflower3456");
		driver.findElement(register2).click();;
		Thread.sleep(1000);
		Screenshot.takesScreenshot("RegisterError1");
        driver.findElement(password).sendKeys("abcdef1234");
		driver.findElement(register2).click();;
		Thread.sleep(1000);
		Screenshot.takesScreenshot("RegisterError2");
		driver.findElement(password1).sendKeys("abcdef346");
		driver.findElement(register2).click();;
		log.error(driver.findElement(alert).getText());

	}


	public void register()
	{
		driver.findElement(register);
		driver.findElement(username).sendKeys("fghjkt56779811908");
		driver.findElement(password).sendKeys("rtyui678889");
		driver.findElement(password1).sendKeys("rtyui678889");
		driver.findElement(register2);
		log.info(driver.findElement(alert).getText());
	}
	



}
