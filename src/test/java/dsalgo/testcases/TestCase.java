/**
 * 
 */
package dsalgo.testcases;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import dsalgo.base.BaseClass;

import dsalgo.pageobjects.Array;
import dsalgo.pageobjects.DataStructure;
import dsalgo.pageobjects.GetStarted;
import dsalgo.pageobjects.Queue;
import dsalgo.pageobjects.signin;


public class TestCase extends BaseClass {
	
	GetStarted gs;
	signin sign;
	
	@BeforeMethod
	public void setup()
	{
		launch();
		gs=new GetStarted();
		gs.getstart();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
	@Test
	public void selarray() throws InterruptedException, IOException
	{
		gs.selectarray();
		gs.clickdatastructure();
		gs.selctany();
		gs.validateregister();
		gs.validatesignin();
		
		
	}
	
	@Test
	public void home() throws InterruptedException
	{
				
		try {
	
	    gs.register();
		
		
		}
		catch(Exception e) {
			System.out.println("the exception is:"+e);
			
		}
						
	}
	@Test
	public void vaild() throws InterruptedException
	{
		sign.signValid();
		
	}
	@Test
	public void invalid() throws InterruptedException, IOException
	
	{ 
		sign=new signin();
		sign.signInValid();
		sign.verifylogin();
			
		}
	@Test
	public void signout() throws InterruptedException
	{
		sign=new signin();
		sign.signout();
	}
	
	@Test
	public void validateRegister() throws IOException, InterruptedException
	{
		gs.clickRegister();
	}
	
	@Test
	public void validateLoginFromExcel() throws IOException, InterruptedException
	{
		sign=new signin();
		sign.signInputFromExcel();
	}
	
	@Test
	public void datastructure() throws Exception
	{
		sign=new signin();
		sign.signValid();
		DataStructure dr=new DataStructure();
		dr.datastructureperform();
	}
	
	@Test
	public void array() throws Exception
	{
		sign=new signin();
		
		sign.signValid();
		Array ar=new Array();
		ar.Arraysel();
		//ar.ArrayPhython();
		ar.performArray();
		
	}
	
	
	@Test
	public void arrayApplication() throws Exception
	{
		sign=new signin();
		sign.signValid();
		Array ar=new Array();
		ar.Arraysel();
		//ar.Arrayapplication();;
		ar.performArray();
	}
	@Test
	public void ArrayPracticeQ() throws InterruptedException, IOException
	{
		sign=new signin();
		sign.signValid();
		Array ar=new Array();
		ar.Arraysel();
		//ar.ArrayPhython();
		ar.practiceQSearchArray();
		
	}
	@Test
	public void ArrayMaxConsPracticeQ() throws InterruptedException, IOException
	{
		sign=new signin();
		sign.signValid();
		Array ar=new Array();
		ar.Arraysel();
		//ar.ArrayPhython();
		ar.practiceQMaxCons();
		
	}
	@Test
	public void ArrayfindnoPracticeq() throws InterruptedException, IOException
	{
		sign=new signin();
		sign.signValid();
		Array ar=new Array();
		ar.Arraysel();
		//ar.ArrayPhython();
		ar.findnum();
		
	}
	@Test
	public void ArraysquarePracticeQ() throws InterruptedException, IOException
	{
		sign=new signin();
		sign.signValid();
		Array ar=new Array();
		ar.Arraysel();
		//ar.ArrayPhython();
		ar.square();
		
	}
	
	
	
	@Test
	public void Queue() throws Exception
	{
		sign=new signin();
		sign.signValid();
		Queue qu= new Queue();
		qu.Quesel();
		//qu.QueuePhython();
		qu.performQueue();
		
	}
	@Test
	public void QueuepracticeQ() throws InterruptedException
	{
		sign=new signin();
		sign.signValid();
		Queue qu= new Queue();
		qu.Quesel();
		qu.practiceQ();
	}
	
	

}
