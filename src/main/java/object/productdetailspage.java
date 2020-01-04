package object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productdetailspage extends BasePage {
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dress;
	
	@FindBy(xpath="(//a[@href='http://automationpractice.com/index.php?id_product=3&controller=product'])[4]")
	private WebElement detail;
	
	@FindBy(xpath="(//button[@type='button'])[1]")
	private WebElement tweet;
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement share;
	@FindBy(id="short_description_content")
	private WebElement text;
	
	public productdetailspage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getdress() {
		return dress;
	}
	public WebElement getpagedetails() {
		return detail;
	}
	public WebElement gettweet() {
		return tweet;
	}
	public WebElement getshare() {
		return share;
	}
	public WebElement gettext() {
		return text;
	}

	
}
