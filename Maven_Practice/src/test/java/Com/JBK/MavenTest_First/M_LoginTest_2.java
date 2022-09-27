package Com.JBK.MavenTest_First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import Com.JBK.LoginPage.M_LoginPage;

public class M_LoginTest_2 {
	WebDriver driver;
	@BeforeSuite
	public void loginTestusingMaven(){
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("file:///F:/Automation%20Testing_Java%20By%20Kiran/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html#");
		
	}
	@Test(priority=2)
	public void loginPageSucess(){
		M_LoginPage lp = new M_LoginPage(driver);
		lp.loginPagedetails();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		
	}
	@Test(priority = 1)
	public void loginTestTitle(){
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Log in");
		Assert.assertEquals(driver.getCurrentUrl(), "file:///F:/Automation%20Testing_Java%20By%20Kiran/Selenium%20Softwares/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html#");
		Assert.assertEquals(driver.findElement(By.xpath("//b")).getText(), "Java By Kiran");
		Assert.assertEquals(driver.findElement(By.xpath("//h4")).getText(), "JAVA | SELENIUM | PYTHON");
	}
	
	@AfterSuite
	public void close(){
		driver.close();
	}

}
