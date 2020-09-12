package page.objects.model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver= driver;
		
	}
	
	By LogInButtonXpath = By.xpath("//a[text()='Login']");
	
	By assertTextXpath = By.xpath("//a[text()='API Testing Automation']");
	
	public WebElement logIn() {
		return driver.findElement(LogInButtonXpath);
	}
	
	public WebElement assertText() {
		return driver.findElement(assertTextXpath);
	}

}
