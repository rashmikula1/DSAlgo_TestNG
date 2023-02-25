package dsalgo.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;

import dsalgo.base.BaseClass;
import dsalgo.utility.ExcelReader;
import dsalgo.utility.Screenshot;

public class Graph extends BaseClass {
	
	By Graph= By.xpath("//div//div[7]//div//div//a[contains(text(),'Get Started')]");
	By Topic= By.xpath("//body/div/ul['+i+']/a[@class='list-group-item']");
	By Tryhere= By.xpath("//a[contains (text(), 'Try here')]");
	By Input= By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
	By Run= By.xpath("//button");
	By GraphRep=By.xpath("//a[text()='Graph Representations']");
	By PracticeQ1 = By.xpath("//a[text()='Practice Questions']");
	    
	public void AccessGraph() throws IOException {
		
	driver.findElement(Graph).click();
	int size= driver.findElements(Topic).size();
	String[][] code= ExcelReader.getData();
	int l=code.length;
	
	for( int j=2;j<=size;j++) {
	
	By Topic= By.xpath("//body/div/ul[" + j + "]/a[@class='list-group-item']");
	driver.findElement(Topic).click();
	
	//System.out.println("Topic is: "+ Topic);
	for(int i=0;i<l;i++)
	{
		driver.findElement(Tryhere).click();

		System.out.println(code);

		driver.findElement(Input).sendKeys(code[i]);
		driver.findElement(Run).click();

		try {
			driver.switchTo().alert().accept();
		}
		catch(Exception e){
			
		}

		driver.navigate().back();

	}
	driver.navigate().back();
	
	}

}
	public void practiceQ()
	{
		driver.findElement(Graph).click();
		driver.findElement(GraphRep).click();
		driver.findElement(PracticeQ1).click();
		
	}
	
}
