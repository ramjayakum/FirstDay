package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstDay {

	@Parameters({ "Fname", "Lname", "Address", "Email", "phone","password","cpassword" })
	@Test
	private void first(String s1, String s2, String s3, String s4, String s5,String s6,String s7) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\JavaProject\\TestNG\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();

		WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys(s1);

		WebElement LastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		LastName.sendKeys(s2);

		WebElement Address = driver.findElement(By.xpath("//textarea[@rows='3']"));
		Address.sendKeys(s3);

		WebElement Email = driver.findElement(By.xpath("//input[@type='email']"));
		Email.sendKeys(s4);

		WebElement phone = driver.findElement(By.xpath("//input[@type='tel']"));
		phone.sendKeys(s5);

		WebElement Mc = driver.findElement(By.xpath("//input[@value='Male']"));
		Mc.click();

		WebElement Hc = driver.findElement(By.xpath("//input[@value='Cricket']"));
		Hc.click();

		// WebElement lanugage=driver.findElement(By.xpath("//div[@id='msdd']"));
		// phone.sendKeys(s6);

		WebElement skills = driver.findElement(By.xpath("//select[@id='Skills']"));
		skills.sendKeys("Java");

		WebElement country = driver.findElement(By.xpath("//select[@id='countries']"));
		country.sendKeys("India");
		Thread.sleep(1000);
		WebElement country1 = driver.findElement(By.xpath("//b[@role='presentation']"));
		country1.click();

		WebElement country2 = driver.findElement(By.xpath("//li[text()='India']"));
		country2.click();

		WebElement year = driver.findElement(By.id("yearbox"));
		Select s = new Select(year);
		s.selectByValue("2014");

		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));

		Select a = new Select(month);
		a.selectByIndex(4);

		WebElement Day = driver.findElement(By.id("daybox"));
		Select b = new Select(Day);
		b.selectByValue("17");
		
		WebElement password = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		password.sendKeys(s6);
		
		WebElement cpassword = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		cpassword.sendKeys(s7);
		
		
		
		
		

	}

}
