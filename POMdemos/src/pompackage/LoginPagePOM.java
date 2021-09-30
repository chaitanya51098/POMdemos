package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPagePOM {
WebDriver driver;
    By email=By.name("Email");
    By password=By.id("Password");
    By signin=By.xpath("//input[@class='button-1 login-button']");
   
    public LoginPagePOM(WebDriver driver)
    {
        this.driver=driver;
    }
   
    public void enteremail(String EM) {
        driver.findElement(email).sendKeys(EM);
    }
   
    public void enterpassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }
   
    public void clicksignin() {
        driver.findElement(signin).click();
    }
   
}
 
