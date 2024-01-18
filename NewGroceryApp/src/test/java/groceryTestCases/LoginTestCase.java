package groceryTestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import elementRepository.HomePage;
import elementRepository.LoginPage;

public class LoginTestCase {
 
	
	public class LoginTestcase extends BaseClass{
		//to access driver, url  access etc, extending the base class to avail them
		
		
	  @Test(groups= {"critical"})
	  public void verifyLogin() throws IOException {
		  LoginPage lp=new LoginPage(driver);
		 readFromProperties();
		  String usernameValue=properties.getProperty("username");
		  String passwordValue=properties.getProperty("password");
		  lp.enterusername(usernameValue);
		  lp.enterPassword(passwordValue);
		  lp.clickLoginbutton();
		  HomePage hp=new HomePage(driver);
		  String actual=hp.getUserText();
		  String expected="Admin";
		  Assert.assertEquals(actual, expected, Constant.loginError);
		  
		  
	  }
	  
	  @Test
	  public void verifyIfRememberMeCheckBoxIsSelected() {
		  LoginPage lp=new LoginPage(driver);
		  Boolean actual=lp.clickRememberMeCheckBox();
		  Boolean expected=true;
		  Assert.assertEquals(actual,expected,Constant.error);
		  
	  }
}
}
