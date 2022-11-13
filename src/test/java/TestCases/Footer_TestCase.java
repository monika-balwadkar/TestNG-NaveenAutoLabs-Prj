package TestCases;

import java.time.Duration;

import org.testng.annotations.Test;

import PageObjectModel.Footer_PageObject;
import Resources.BaseClass;

public class Footer_TestCase extends BaseClass {

	@Test
	public static void verifyFooter()
	{
		Footer_PageObject fpo=new Footer_PageObject(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//Information
		fpo.aboutUsClick().click();
		fpo.deliveryInfoClick().click();
		fpo.privacyPolicyClick().click();
		fpo.termsAndConditionsClick().click();
		
//Customer Service
		fpo.contactUsClick().click();
		fpo.returnsClick().click();
		fpo.siteMapClick().click();
		
//Extras
		fpo.brandClick().click();
		fpo.giftCertificatesClick().click();
		fpo.affiliateClick().click();
		fpo.specialsClick().click();
		
		
		
	}
}
