package Resources;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CommonUtilities {

	public static WebDriver driver;
	public static double productPriceHandle(String price1)
	{
		String price =price1;
		String pr[]=price.split("\\s+");
		System.out.println(Arrays.toString(pr));
		String a=pr[0];
		System.out.println("Method:"+a);
		String removeDoller=a;
		String AfterRemoveDoller=removeDoller.replaceAll("[$]","");
		System.out.println("Before parseDouble:"+AfterRemoveDoller);
		double d=Double.parseDouble(AfterRemoveDoller);
		System.out.println("After parseDouble:="+d);
		return d;
	}

	public static void handleDropDown(WebElement ele,int index)
	{
		WebElement hdd=ele; 
		Select s=new Select(hdd);
		s.selectByIndex(index);
	}
	public static void handleDropDownByVisibleText(WebElement ele,String str)
	{
		WebElement hdd=ele; 
		Select s=new Select(hdd);
		s.selectByVisibleText(str);
	}

	public static void mouseOverHandle(WebElement ele,WebDriver driver) throws InterruptedException
	{
		WebElement mo=ele;
		Actions action1=new Actions(driver);
		Thread.sleep(2000);
		action1.moveToElement(mo).perform();
	}
}
