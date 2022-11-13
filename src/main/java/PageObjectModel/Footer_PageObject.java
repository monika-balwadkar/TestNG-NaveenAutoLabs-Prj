package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Footer_PageObject {


	public WebDriver driver;

//Information
	By about_us=By.xpath("//a[text()='About Us']");
	By delivery_infos=By.xpath("//a[text()='Delivery Information']");
	By privacy_policy=By.xpath("//a[text()='Privacy Policy']");
	By trems_conditions=By.xpath("//a[text()='Terms & Conditions']");
	
//Customer Service
	By contact_us=By.xpath("//a[text()='Contact Us']");
	By returns=By.xpath("//a[text()='Returns']");
	By site_map=By.xpath("//a[text()='Site Map']");
	
//Extras
	By brand=By.xpath("//a[text()='Brands']");
	By gift_certificates=By.xpath("//a[text()='Gift Certificates']");
	By affiliate=By.xpath("//a[text()='Affiliate']");
	By specials=By.xpath("//a[text()='Specials']");	
	
	
	public Footer_PageObject(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}
//Information
	public WebElement aboutUsClick()
	{
		return driver.findElement(about_us);
	}
	public WebElement deliveryInfoClick()
	{
		return driver.findElement(delivery_infos);
	}
	public WebElement privacyPolicyClick()
	{
		return driver.findElement(privacy_policy);
	}
	public WebElement termsAndConditionsClick()
	{
		return driver.findElement(trems_conditions);
	}
//Customer Service
	public WebElement contactUsClick()
	{
		return driver.findElement(contact_us);
	}
	public WebElement returnsClick()
	{
		return driver.findElement(returns);
	}
	public WebElement siteMapClick()
	{
		return driver.findElement(site_map);
	}
//Extras
	public WebElement brandClick()
	{
		return driver.findElement(brand);
	}
	public WebElement giftCertificatesClick()
	{
		return driver.findElement(gift_certificates);
	}
	public WebElement affiliateClick()
	{
		return driver.findElement(affiliate);
	}
	public WebElement specialsClick()
	{
		return driver.findElement(specials);
	}

	
}
