package dsalgo.pageobjects;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import dsalgo.base.BaseClass;
import dsalgo.utility.Screenshot;

public class Register extends BaseClass {
	private static Logger log= LogManager.getLogger(Register.class);
	By username= By.xpath("//input[@id='id_username']");
	By password= By.xpath("//input[@id='id_password1']");
	By password1= By.xpath("//input[@id='id_password2']");
	By register2= By.xpath("//input[@value='Register']");
	By register= By.xpath("//a[text()=' Register ']");
	By alert= By.xpath("//div[@class='alert alert-primary']");


	public void clickRegister() throws IOException, InterruptedException
	{
		driver.findElement(register).click();;
		driver.findElement(register2).click();;
		Thread.sleep(1000);
		Screenshot.takesScreenshot("RegisterError");
		driver.findElement(username).sendKeys(prop.getProperty("RegUsername"));
		driver.findElement(register2).click();;
		Thread.sleep(1000);
		Screenshot.takesScreenshot("RegisterError1");
		driver.findElement(password).sendKeys(prop.getProperty("RegPassword"));
		driver.findElement(register2).click();;
		Thread.sleep(1000);
		Screenshot.takesScreenshot("RegisterError2");
		driver.findElement(password1).sendKeys(prop.getProperty("RegPassword1"));
		driver.findElement(register2).click();;
		log.error(driver.findElement(alert).getText());

	}
	public void register() throws InterruptedException
	{
		driver.findElement(register).click();;
		driver.findElement(username).sendKeys(prop.getProperty("RegUsername"));
		driver.findElement(password).sendKeys(prop.getProperty("RegPassword"));
		driver.findElement(password1).sendKeys(prop.getProperty("RegPassword"));

		driver.findElement(register2).click();
		log.info(driver.findElement(alert).getText());
	}


}
