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
import dsalgo.pageobjects.LinkedList;
import dsalgo.pageobjects.Queue;
import dsalgo.pageobjects.Register;
import dsalgo.pageobjects.Stack;
import dsalgo.pageobjects.Tree;
import dsalgo.pageobjects.signin;


public class TestCase extends BaseClass {

	GetStarted gs;
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

			rj.register();


		}
		catch(Exception e) {
			System.out.println("The exception is:"+e);

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

		sign.signInValid();
		sign.verifylogin();

	}
	@Test
	public void signout() throws InterruptedException
	{

		sign.signout();
	}

	@Test
	public void validateRegister() throws IOException, InterruptedException
	{
		rj.clickRegister();
	}

	@Test
	public void validateLoginFromExcel() throws IOException, InterruptedException
	{

		sign.signInputFromExcel();
	}

	@Test
	public void datastructure() throws Exception
	{

		sign.signValid();
		
		dr.datastructureperform();
	}
	
	@Test
	public void datastructurePracticeQ() throws InterruptedException
	{
		sign.signValid();
		dr.PracticeQ();
	}

	@Test
	public void array() throws Exception
	{


		sign.signValid();

		ar.Arraysel();

		ar.performArray();

	}


	@Test
	public void ArrayPracticeQ() throws InterruptedException, IOException
	{
		
		sign.signValid();
		ar.Arraysel();
     	ar.practiceQSearchArray();

	}
	@Test
	public void ArrayMaxConsPracticeQ() throws InterruptedException, IOException
	{

		sign.signValid();

		ar.Arraysel();
		//ar.ArrayPhython();
		ar.practiceQMaxCons();

	}
	@Test
	public void ArrayfindnoPracticeq() throws InterruptedException, IOException
	{

		sign.signValid();

		ar.Arraysel();

		ar.findnum();

	}
	@Test
	public void ArraysquarePracticeQ() throws InterruptedException, IOException
	{

		sign.signValid();

		ar.Arraysel();

		ar.square();

	}



	@Test
	public void Queue() throws Exception
	{
		
		sign.signValid();
		
		qu.Quesel();
		qu.performQueue();

	}
	@Test
	public void QueuePracticeQ() throws InterruptedException
	{
		
		sign.signValid();
		
		qu.Quesel();
		qu.practiceQ();
	}


	@Test
	public void Linkedlist() throws InterruptedException, IOException
	{

		sign.signValid();
		
		ll.LList1();
		

	}
	
	@Test
	public void LinkedlistPracticeQ() throws InterruptedException
	{
		sign.signValid();
		ll.PracticeQ();
	}
	
	@Test
	public void stack() throws InterruptedException, IOException
	{

		
		sign.signValid();
		
		st.Stack1();
		


	}
	@Test
	public void stackPracticeQ() throws InterruptedException
	{
		sign.signValid();
		st.PracticeQ();
		
	}

	@Test
	public void tree() throws InterruptedException, IOException
	{

		sign.signValid();
		
		tr.AccessTree();

	}
	@Test
	public void treePracticeQ() throws InterruptedException
	{
		sign.signValid();
		tr.PracticeQ();
	}
	@Test
	public void graph() throws InterruptedException, IOException
	{
		sign.signValid();
		gr.AccessGraph();
	}
	
	@Test
	public void graphPRacticeQ() throws InterruptedException
	{
		sign.signValid();
		gr.practiceQ();
	}
	

}
