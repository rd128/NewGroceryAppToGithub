package groceryTestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class BaseClass {
 
	
	WebDriver driver;
	public static Properties properties;
	
	// ref variable for properties class
	// properties class used to get key values
	// ref variable made global, so can be used throughout
	// made public static to access properties variable anywhere
	// as static ,so classname.variable
	

	public static void readFromProperties() throws IOException {

		properties = new Properties();
		// must change the filepath as per your folder path,as it cud be different for
		// diff systems
		// change happens as we clone another person's code from git
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "//src//main//resources//config.properties");
		properties.load(ip);

	}

	
	
	@BeforeMethod(alwaysRun = true)
	public void beforeMethod() throws IOException {
		
		
             driver = new ChromeDriver();
 	
		// properties class ref variable.value req
		// passing value properties.getProperty("keyused")
		// as sameclass function,called without object
		
		driver.get("https://groceryapp.uniqassosiates.com/admin/login");

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
	}

	@AfterMethod(alwaysRun = true)
	public void afterMethod(ITestResult itestResult) throws IOException {
	
		driver.close();
	}
}
