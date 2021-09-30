package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pompackage.LoginPagePOM;

public class VerifyLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		LoginPagePOM login=new LoginPagePOM(driver);
        
        login.enteremail("rekhabr1@gmail.com");
        login.enterpassword("rekhab");
        login.clicksignin();

		

	}

}



