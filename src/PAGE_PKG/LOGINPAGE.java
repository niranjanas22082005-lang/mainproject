package PAGE_PKG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LOGINPAGE {
     By user=By.id("ulogin");
     By pass=By.name("upass");
     By login=By.name("ulogin");
     
     WebDriver driver;
     public LOGINPAGE(WebDriver driver)
     {
    	 this.driver=driver;
    	 
     }
     public void start(String username,String password)
     {
    	 driver.findElement(user).sendKeys(username);
    	 driver.findElement(pass).sendKeys(password);
     }
     public void login()
     {
    	 driver.findElement(login).click();
     }
}
