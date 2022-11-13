package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public Properties prop;
	
	public void initializeDriver() throws IOException
	{
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		prop=new Properties();
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			
		}
		else
		{
			System.out.println("Browser is not accessible");
		}
	}
	@BeforeMethod
	public void launchUrl() throws IOException
	{
		initializeDriver();
		String urlName=prop.getProperty("url");
		driver.get(urlName);
	}
}
