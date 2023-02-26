package dsalgo.pageobjects;
import org.openqa.selenium.By;
import dsalgo.base.BaseClass;

public class GetStarted extends BaseClass {
	
	By gtStarted= By.xpath("//button[text()='Get Started']");
	

	public void getstart()
	{
		driver.findElement(gtStarted).click();


	}
	


}
