package testing;

import org.testng.Assert;
import org.testng.annotations.Test;

import object.BasePage;
import object.productdetailspage;

public class productdetailstest {
	productdetailspage pd;
	BasePage bp;
	
	public productdetailstest() {
		pd = new productdetailspage();
		bp =new BasePage();
	}
	
	@Test
	public void details() {
		pd.getdress().click();
		pd.getpagedetails().click();
		Assert.assertTrue(pd.gettweet().isDisplayed(), "is not found");
		Assert.assertTrue(pd.getshare().isDisplayed(), "is not found");
		Assert.assertTrue(pd.gettext().isDisplayed(), "is not found");
	}

}
