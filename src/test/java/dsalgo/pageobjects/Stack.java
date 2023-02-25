package dsalgo.pageobjects;

import java.io.IOException;

import org.openqa.selenium.By;

import dsalgo.base.BaseClass;
import dsalgo.utility.ExcelReader;

public class Stack extends BaseClass {
	 By selectdropStack =By.xpath("//div[@class='nav-item dropdown']");
     By SelectStack =By.xpath("//a[text()='Stack']");
     /*By opinstack = By.xpath("//a[text()='Operations in Stack']");
     By Implementation = By.xpath("//a[text()='Implementation']");*/
     By Applications = By.xpath("//a[text()='Operations in Stack']");
     By PracticeQ1 = By.xpath("//a[text()='Practice Questions']");
     By tryhere =By.xpath("//a[text()='Try here>>>']");
     By Blankpage1 = By.xpath("//form[@id='answer_form']/div/div/div[1]/textarea");
     By Topic= By.xpath("//body/div/ul['+j+']/a[@class='list-group-item']");
     By Run = By.xpath("//button[text()='Run']");
     
     public void Stack1() throws IOException {
 		driver.findElement(selectdropStack).click();
 		driver.findElement(SelectStack).click();
 		int size= driver.findElements(Topic).size();
 		
 		for( int j=1;j<=size;j++) {
 		
 		By Topic= By.xpath("//body/div/ul[" + j + "]/a[@class='list-group-item']");
 		driver.findElement(Topic).click();
 		
   
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
    	 driver.findElement(selectdropStack).click();
    	 driver.findElement(SelectStack).click();
    	 driver.findElement(Applications).click();
    	 driver.findElement(PracticeQ1).click();
     }
}



