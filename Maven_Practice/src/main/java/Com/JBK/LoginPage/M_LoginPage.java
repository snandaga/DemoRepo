package Com.JBK.LoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class M_LoginPage {
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button")
	WebElement btn;
	
	
	public M_LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	
	public void loginPagedetails(){
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		btn.click();
	}

}
