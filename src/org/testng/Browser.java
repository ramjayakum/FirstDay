package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browser {
	WebDriver driver=null;
	@Parameters({"browser"})
	@Test
	private void test12(String name) {
		if(name.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\JavaProject\\TestNG\\driver\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
		}else if(name.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\JavaProject\\TestNG\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}else if(name.equals("ff")) {
			System.setProperty("webdriver.gecko.driver", "C:\\JavaProject\\TestNG\\driver\\geckodriver.exe");
		}else {
			System.out.println("Invaild Browser");
		}driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Ram");
		driver.findElement(By.id("pass")).sendKeys("kumar");
	}
     
}
