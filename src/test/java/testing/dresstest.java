package testing;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import object.BasePage;
import object.dressobject;

public class dresstest {
	dressobject dressob;
	BasePage bp;
	
	public dresstest() {
		dressob =new dressobject();
		bp =new BasePage();
	}
	@Test(groups= {"Regression"})
	public void dess() {
		dressob.getdress().click();
		Assert.assertTrue(bp.getTitlte().contains("Dresses"));	
	}
	@Test





	public void verifydis() {

		Assert.assertTrue(dressob.getsize().isDisplayed(), "failed");	
		Assert.assertTrue(dressob.getmedium().isDisplayed(), "failed");
		Assert.assertTrue(dressob.getlarge().isDisplayed(), "failed");
	}
	@Test
<<<<<<< HEAD
	public void cart() {
=======

	public void cart324() {

	public void cart123() {

>>>>>>> 0e74dff3d848f46f8bb41fa08b803c4ebdf524d7
		bp.movemouse(dressob.getproduct());
		dressob.getcart().click();
		dressob.getcheckout().click();
		Assert.assertTrue(dressob.getTxtAttribute(dressob.getvalue()).contains("1"),"fail");
		
	}
	@Test
	public void verifycountvicky() {
		String s= dressob.getcount().getText();
		System.out.println(s);
	    int b =	dressob.getimg().size();
	    System.out.println(b);
	    String c=Integer.toString(b);
	    System.out.println(c);
	    Assert.assertTrue(s.contains(c),"failed");
	    
		
	}
}
