package TestCases;

import java.time.Duration;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.MainMenu_PageObject;
import Resources.BaseClass;
import Resources.CommonUtilities;


public class MainMenu_TestCase extends BaseClass {

	@Test
	public static void verifyMainMenu() throws InterruptedException
	{
		MainMenu_PageObject mp=new MainMenu_PageObject(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
//Mouseover to Desktop
		CommonUtilities.mouseOverHandle(mp.desktopMenuClick(),driver);
		mp.desktopShowAllClick().click();    //click on desktop :show all
		mp.desktopAddtoWishlistClick().click(); //added product to wishList
		
//Mouseover to Laptop
		CommonUtilities.mouseOverHandle(mp.laptopMenuClick(),driver);  
		mp.laptopShowAllClick().click();
		mp.laptopListViewClick().click();
		CommonUtilities.handleDropDown(mp.laptopSortByClick(),3);
		CommonUtilities.handleDropDown(mp.laptopShowByClick(),1);
		mp.laptopCompareAddClick().click();
		mp.laptopCompareProductClick().click();
		
//Mouseover to Component
		CommonUtilities.mouseOverHandle(mp.componentMenuClick(),driver); 
		mp.componentOptionClick().click();
		mp.componentGridClick().click();
		
//Mouseover to Mp3Player
		CommonUtilities.mouseOverHandle(mp.mp3playerMenuClick(),driver);
		mp.mp3OptionClick().click();
		
		
		
	}
}
