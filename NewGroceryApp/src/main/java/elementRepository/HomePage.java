package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.GeneralUtilities;

public class HomePage {
	
	
	GeneralUtilities gu=new GeneralUtilities();

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	WebDriver driver;
	
	@FindBy(xpath="//a[@data-toggle='dropdown']")
	WebElement user;
	
	@FindBy(xpath="//span[text()='7rmart supermarket']")
	WebElement homePageText;
	
	@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-order'])[1]")
	WebElement manageOrders;
	
	@FindBy(xpath="(//a[@href='https://groceryapp.uniqassosiates.com/admin/list-slider'])[1]")
	WebElement manageSlider;
	
	@FindBy(xpath="(//p[text()='Manage Users'])[1]")
	WebElement manageUsers;	
	public String getColorOfManagerUser() {
	return gu.getColorCssValue(manageUsers);
	}
	public String getUserText() {
		return gu.getElementText(user);
	}
	public String getHomePageText() {
		return gu.getElementText(homePageText);
	}
	public void clickManageOrders() {
		gu.clickButton(manageOrders);
	}
	
	public void clickmanageSlider() {
		gu.clickButton(manageSlider);
	}

}
