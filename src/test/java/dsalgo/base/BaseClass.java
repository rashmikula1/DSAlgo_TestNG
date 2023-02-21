
	package dsalgo.base;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Properties;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.BeforeTest;

	

	public class BaseClass {
		
		public static Properties prop;
		public static WebDriver driver;

		public static void launch()
		{
			try {
				 prop = new Properties();
				System.out.println("Super constructor invoked");
				FileReader ip= new FileReader("C:\\Users\\rashm\\eclipse-workspace\\DSAlgo\\Configuration\\Config.properties");
				prop.load(ip);
				System.out.println("driver: "+driver);
				
			}catch(FileNotFoundException e) {
				e.printStackTrace();
				
			}catch (IOException e) {
				e.printStackTrace();
			}
			
		



			String browserName=prop.getProperty("browser");
			if(browserName.contains("Chrome"))
			{
				driver= new ChromeDriver();
			}
			else if(browserName.contains("FireFox"))
			{
				driver= new FirefoxDriver();
			}
			else if(browserName.contains("Edge"))
				
			{
				driver=new EdgeDriver();
			}
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			//driver.manage().timeouts().pageLoadTimeout(10, null);
			driver.get(prop.getProperty("url"));
		}
		
	}


