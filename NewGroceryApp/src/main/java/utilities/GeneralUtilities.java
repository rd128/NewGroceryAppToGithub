package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GeneralUtilities {
	public String getElementText(WebElement element) {
		String text=element.getText();
		return text;
	}
	
	public void enterValue(WebElement element,String value) {
		element.sendKeys(value);
}
	
	public void clickButton(WebElement element) {
		element.click();
	}
	
	public void dropDownSelect(WebElement element,String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	
	public String getColorCssValue(WebElement element) {
		return element.getCssValue("color");
		
	}
	public void enterValueNumeric(WebElement element,int value) {
		 element.sendKeys(String.valueOf(value));
		
	}

}
