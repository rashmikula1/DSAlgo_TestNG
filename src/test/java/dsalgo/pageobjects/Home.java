package dsalgo.pageobjects;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import dsalgo.base.BaseClass;

public class Home extends BaseClass {
	
	private static Logger log= LogManager.getLogger(Home.class);
	
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


	
	public void selectarray() throws IOException
	{
		driver.findElement(dropdown).click();
		driver.findElement(array).click();
		String text=driver.findElement(alert).getText();

		//Screenshot.takesScreenshot("alert");

         log.info("The error "+ text);


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
			//Thread.sleep(1000);
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

}
