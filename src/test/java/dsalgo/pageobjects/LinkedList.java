package dsalgo.pageobjects;

import java.io.IOException;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import dsalgo.base.BaseClass;
import dsalgo.utility.ExcelReader;

public class LinkedList extends BaseClass {

	By LLgetstarted=By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[3]/div/div/a");
	By Topic= By.xpath("//body/div/ul['+j+']/a[@class='list-group-item']");
	By PracticeQ1 = By.xpath("//a[text()='Practice Questions']");
	By tryhere =By.xpath("//a[text()='Try here>>>']");
	By Blankpage1 = By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
	By LLDeletion =By.xpath("//a[text()='Deletion']");
	By Run = By.xpath("//button[text()='Run']");
	public void LList1() throws IOException {
		driver.findElement(LLgetstarted).click();
		int size= driver.findElements(Topic).size();
		for( int j=1;j<=size;j++) {

			By Topic= By.xpath("//body/div/ul[" + j + "]/a[@class='list-group-item']");
			driver.findElement(Topic).click();

			//System.out.println("Topic is: "+ Topic);

			//public void perform_for_loop() throws InterruptedException, IOException { 
			String[][] code=ExcelReader.getData();

			for(int i=0;i<=2;i++) {
				driver.findElement(tryhere).click();
				driver.findElement(Blankpage1).sendKeys(code[i]);
				driver.findElement(Run).click();


				try {
					driver.switchTo().alert().accept();
				}

				catch (Exception e) {
					//e.printStackTrace();
				}
				driver.navigate().back();
			}
			driver.navigate().back(); 	  	
		}

	}
	public void PracticeQ() {
		driver.findElement(LLgetstarted).click();
		driver.findElement(LLDeletion).click();
		driver.findElement(PracticeQ1).click();
	}
}


