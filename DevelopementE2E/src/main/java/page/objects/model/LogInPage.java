package page.objects.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import FrameWork.browserUtils;

public class LogInPage {
	
	public WebDriver driver;
	
	  public LogInPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		  this.driver=driver;
	}
	
   
	By userNameCss= By.cssSelector("#user_email");
	By passwordCss= By.cssSelector("#user_password");
    By loginButtonCss= By.cssSelector("input[value='Log In']");
	

	public WebElement username() {
		return driver.findElement(userNameCss);
		
	}
	
	public WebElement password() {
		return driver.findElement(passwordCss);
	}
	
	public WebElement loginButton() {
		return driver.findElement(loginButtonCss);
	}
}
