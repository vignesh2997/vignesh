package object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dressobject extends BasePage {
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")
	private WebElement dress;
	
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-s']")
	private WebElement size;
	
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-m']")
	private WebElement medium;
	
	@FindBy(xpath="//a[@href='http://automationpractice.com/index.php?id_category=8&controller=category#size-l']")
	private WebElement large;
	
	@FindBy(xpath="(//a[@href='http://automationpractice.com/index.php?id_product=3&controller=product'])[1]")
	private WebElement product;
	
	@FindBy(xpath="(//a[@href='http://automationpractice.com/index.php?controller=cart&add=1&id_product=3&token=e817bb0705dd58da8db074c69f729fd8'])")
	private WebElement cart;
	
	@FindBy(xpath="(//a[@href='http://automationpractice.com/index.php?controller=order'])[3]")
	private WebElement checkout;
	@FindBy(xpath="//input[@value='1']")
	private WebElement value;
	
	@FindBy(xpath="//span[@class='heading-counter']")
	private WebElement count;
	
//	@FindBys(@FindBy(xpath="//a[@class='product_img_link']")) //5 product paths
//	private List<WebElement> img;
	
	@FindBy(xpath="//a[@class='product_img_link']")
	private List<WebElement> img;
	
	public dressobject() {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getdress() {
		return dress;
	}
	public WebElement getsize() {
		return size;
	}
	public WebElement getmedium() {
		return medium;
	}
	public WebElement getlarge() {
		return large;
	}
	public WebElement getcart() {
		return cart;
	}
	public WebElement getproduct() {
		return product;	
	}
	public WebElement getcheckout() {
		return checkout;
	}
	public WebElement getvalue() {
		return value;
	}
	public WebElement getcount() {
		return count;
	}
	public List<WebElement> getimg() {
		return img;
		
	}

}
