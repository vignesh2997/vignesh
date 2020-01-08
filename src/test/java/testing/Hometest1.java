package testing;

import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import object.BasePage;
import object.Homepage;

public class Hometest1 {
	Homepage hp;
	BasePage bp;
	int random =new Random().nextInt(500000);
	String email ="vignesh"+random+"@gmail.com";
	
	
	public Hometest1() {
		hp =new Homepage();
		bp=new BasePage();	
	}
	
	@Test
	public  void women2(){
		hp.getwomen().click();	
		Assert.assertTrue(bp.getTitlte().contains("Women"));
	}
	@Test
	public void dress() {
		hp.getdress().click();
		Assert.assertTrue(bp.getTitlte().contains("Dresses"));
	}
	@Test
	public void tshirts3() {
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
