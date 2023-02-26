package dsalgo.pageobjects;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import dsalgo.base.BaseClass;
import dsalgo.utility.ExcelReader;
import dsalgo.utility.Screenshot;

public class signin extends BaseClass {

	By signin= By.xpath("//a[text()='Sign in']");
	By username= By.xpath("//input[@id='id_username']");
	By password= By.xpath("//input[@name='password']");
	By login=By.xpath("//input[@value='Login']");
	By alert= By.xpath("//div[@class='alert alert-primary']");
	By signout= By.xpath("//a[text()='Sign out']");
	private static Logger log= LogManager.getLogger(GetStarted.class);
	
	public void verifylogin() throws IOException, InterruptedException
	{
		driver.findElement(login).click();;
		
		driver.findElement(username).sendKeys(prop.getProperty("Username"));
		driver.findElement(login).click();;
		
		Screenshot.takesScreenshot("Login1");

	}

	public void signValid() throws InterruptedException
	{
		driver.findElement(signin).click();;
		driver.findElement(username).sendKeys(prop.getProperty("Username"));
		driver.findElement(password).sendKeys(prop.getProperty("Password"));
		
		driver.findElement(login).click();;
		log.info(driver.findElement(alert).getText());

	}

	public void signInValid() throws InterruptedException
	{
		driver.findElement(signin).click();;
		driver.findElement(username).sendKeys(prop.getProperty("InvalidUsername"));
		driver.findElement(password).sendKeys(prop.getProperty("InvalidPassword"));
		Thread.sleep(1000);
		driver.findElement(login).click();
		//System.out.println("Login is not successful");
		log.info(driver.findElement(alert).getText());
	}
	public void signout() throws InterruptedException
	{
		driver.findElement(signin).click();;
		driver.findElement(username).sendKeys(prop.getProperty("Username"));
		driver.findElement(password).sendKeys(prop.getProperty("Password"));
		
		driver.findElement(login).click();;
		driver.findElement(signout).click();;
		log.info(driver.findElement(alert).getText());

	}
	public void signInputFromExcel() throws IOException, InterruptedException

	{
		driver.findElement(signin).click();
		String[][] input= ExcelReader.LoginData();
		int row= input.length;
		
		for(int i=0;i<row;i++)

		{
			driver.findElement(username).sendKeys(input[i][0]);
			driver.findElement(password).sendKeys(input[i][1]);
			driver.findElement(login).click();


		}

	}
}




