package pagefactorytestdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pagefactoryPOM.LoginPOM;

public class LoginCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		 LoginPOM LoginPage=PageFactory.initElements(driver, LoginPOM.class);
	        
	        LoginPage.inputemail("rekhabr1@gmail.com");
	        LoginPage.inputpassword("rekhab");
	        LoginPage.clicklogin();
	        
	        driver.close();

		

	}

}
