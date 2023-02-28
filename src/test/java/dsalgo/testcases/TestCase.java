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
import dsalgo.pageobjects.Graph;
import dsalgo.pageobjects.Home;
import dsalgo.pageobjects.LinkedList;
import dsalgo.pageobjects.Queue;
import dsalgo.pageobjects.Register;
import dsalgo.pageobjects.Stack;
import dsalgo.pageobjects.Tree;
import dsalgo.pageobjects.signin;


public class TestCase extends BaseClass {

	GetStarted gs= new GetStarted();
	Home hm= new Home();
	signin sign =new signin();
	Register rj=new Register();
	Graph gr= new Graph();
	Array ar=new Array();
	Queue qu= new Queue();
	LinkedList ll= new LinkedList();
	Stack st=new Stack();
	Tree tr= new Tree();
	DataStructure dr=new DataStructure();
	@BeforeMethod
	public void setup()
	{
		launch();
		
		gs.getstart();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}

	@Test(priority=1)
	public void selarray() throws InterruptedException, IOException
	{
		Home hm= new Home();
		hm.selectarray();
		hm.clickdatastructure();
		hm.selctany();
		hm.validateregister();
		hm.validatesignin();


	}

	@Test(priority=2)
	public void home() throws InterruptedException
	{

		try {

			rj.register();


		}
		catch(Exception e) {
			System.out.println("The exception is:"+e);

		}

	}
	@Test(priority=3)
	public void vaild() throws InterruptedException
	{
		sign.signValid();

	}
	@Test(priority=4)
	public void invalid() throws InterruptedException, IOException

	{ 

		sign.signInValid();
		sign.verifylogin();

	}
	@Test(priority=5)
	public void signout() throws InterruptedException
	{

		sign.signout();
	}

	@Test(priority=6)
	public void validateRegister() throws IOException, InterruptedException
	{
		rj.clickRegister();
	}

	@Test(priority=7)
	public void validateLoginFromExcel() throws IOException, InterruptedException
	{

		sign.signInputFromExcel();
	}

	@Test(priority=8)
	public void datastructure() throws Exception
	{

		sign.signValid();
		
		dr.datastructureperform();
	}
	
	@Test(priority=9)
	public void datastructurePracticeQ() throws InterruptedException
	{
		sign.signValid();
		dr.PracticeQ();
	}

	@Test(priority=10)
	public void array() throws Exception
	{


		sign.signValid();

		ar.Arraysel();

		ar.performArray();

	}


	@Test(priority=11)
	public void ArrayPracticeQ() throws InterruptedException, IOException
	{
		
		sign.signValid();
		ar.Arraysel();
     	ar.practiceQSearchArray();

	}
	@Test(priority=12)
	public void ArrayMaxConsPracticeQ() throws InterruptedException, IOException
	{

		sign.signValid();

		ar.Arraysel();
		//ar.ArrayPhython();
		ar.practiceQMaxCons();

	}
	@Test(priority=13)
	public void ArrayfindnoPracticeq() throws InterruptedException, IOException
	{

		sign.signValid();

		ar.Arraysel();

		ar.findnum();

	}
	@Test(priority=14)
	public void ArraysquarePracticeQ() throws InterruptedException, IOException
	{

		sign.signValid();

		ar.Arraysel();

		ar.square();

	}



	@Test(priority=15)
	public void Queue() throws Exception
	{
		
		sign.signValid();
		
		qu.Quesel();
		qu.performQueue();

	}
	@Test(priority=16)
	public void QueuePracticeQ() throws InterruptedException
	{
		
		sign.signValid();
		
		qu.Quesel();
		qu.practiceQ();
	}


	@Test(priority=17)
	public void Linkedlist() throws InterruptedException, IOException
	{

		sign.signValid();
		
		ll.LList1();
		

	}
	
	@Test(priority=18)
	public void LinkedlistPracticeQ() throws InterruptedException
	{
		sign.signValid();
		ll.PracticeQ();
	}
	
	@Test(priority=19)
	public void stack() throws InterruptedException, IOException
	{

		
		sign.signValid();
		
		st.Stack1();
		


	}
	@Test(priority=20)
	public void stackPracticeQ() throws InterruptedException
	{
		sign.signValid();
		st.PracticeQ();
		
	}

	@Test(priority=21)
	public void tree() throws InterruptedException, IOException
	{

		sign.signValid();
		
		tr.AccessTree();

	}
	@Test(priority=22)
	public void treePracticeQ() throws InterruptedException
	{
		sign.signValid();
		tr.PracticeQ();
	}
	@Test(priority=23)
	public void graph() throws InterruptedException, IOException
	{
		sign.signValid();
		gr.AccessGraph();
	}
	
	@Test(priority=24)
	public void graphPRacticeQ() throws InterruptedException
	{
		sign.signValid();
		gr.practiceQ();
	}
	

}
