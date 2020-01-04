package object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends BasePage {
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
			
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dress;
	
	@FindBy(xpath="(//a[@title='T-shirts'])[2]")
	private WebElement tshirt;
	
	@FindBy(id="newsletter-input")
	private WebElement newsletter;
	
	@FindBy(name="submitNewsletter")
	private WebElement submit;
	
	@FindBy(xpath="//p[@class='alert alert-success']")
	private WebElement alert;
	
	public Homepage() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getwomen() {
		return women;
	}
	public WebElement getdress() {
		return dress;
	}
	public WebElement gettshirt() {
		return tshirt;
	}
	public void setemailadress(String email) {
		setText(newsletter,email);
	}
	public WebElement getsubmit() {
		return submit;
	}
	public WebElement getalertt() {
		return alert;
		
	}
}
