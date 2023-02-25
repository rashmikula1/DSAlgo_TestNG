package dsalgo.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;

import dsalgo.base.BaseClass;
import dsalgo.utility.ExcelReader;
import dsalgo.utility.Screenshot;

public class Tree extends BaseClass {
	String Code= "print('Test')";
	String Code1= "Test";
	By Tree= By.xpath("//div//div[6]//div//div//a[contains(text(),'Get Started')]");
	By Topic= By.xpath("//body/div/ul['+i+']/a[@class='list-group-item']");
	By Tryhere= By.xpath("//a[contains (text(),'Try here')]");
	By Input= By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
	By Run= By.xpath("//button");
	By OverviewTree= By.xpath("//a[text()='Overview of Trees']");
	By PracticeQ1 = By.xpath("//a[text()='Practice Questions']");
	
	public void AccessTree() throws IOException, InterruptedException {
		
	driver.findElement(Tree).click();
	String[][] code= ExcelReader.getData();
	int l=code.length;
	int size= driver.findElements(Topic).size();
	
	for( int j=1;j<=size;j++) {
		
			
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
	
	public void PracticeQ()
	{
		driver.findElement(Tree).click();
		driver.findElement(OverviewTree).click();
		driver.findElement(PracticeQ1).click();
		
	}
}
