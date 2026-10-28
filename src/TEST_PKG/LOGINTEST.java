package TEST_PKG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PAGE_PKG.LOGINPAGE;

public class LOGINTEST {
	WebDriver driver;
	@BeforeTest
	public void main()
	{
		driver=new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		
	}
@Test
public void fb()
{
	LOGINPAGE ob= new LOGINPAGE(driver);
	ob.start("abc@gmail.com", "1234");
	ob.login();
	
}

}
