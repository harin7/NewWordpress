package cts.practice.seleniumprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginScriptTest{
	public void loginToApplication() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Joythirmayee\\eclipse-workspace\\onlineclass\\src\\test\\resources\\binaries\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	    driver.findElement(By.className("username")).sendKeys("Admin");
	    driver.findElement(By.className("txtpassword")).sendKeys("admin123");
	    driver.findElement(By.id("Login")).click();
	    driver.quit();
	    
	}

}
