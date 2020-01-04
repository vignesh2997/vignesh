package testing;

import java.util.Random;

import org.openqa.selenium.remote.server.handler.GetAlertText;
import org.testng.Assert;
import org.testng.annotations.Test;

import object.BasePage;
import object.Homepage;

public class Hometest {
	Homepage hp;
	BasePage bp;
	int random =new Random().nextInt(500000);
	String email ="vignesh"+random+"@gmail.com";
	
	
	public Hometest() {
		hp =new Homepage();
		bp=new BasePage();	
	}
	
	@Test
	public  void women(){
		hp.getwomen().click();	
		Assert.assertTrue(bp.getTitlte().contains("Women"));
	}
	@Test
	public void dress() {
		hp.getdress().click();
		Assert.assertTrue(bp.getTitlte().contains("Dresses"));
	}
	@Test
	public void tshirts() {
		hp.gettshirt().click();
		Assert.assertTrue(bp.getTitlte().contains("T-shirts"));
	}
	@Test
	public void email(){
		hp.setemailadress(email);
		hp.getsubmit().click();
		 String val= hp.getalertt().getText();
		System.out.println(val);
	}	
}
