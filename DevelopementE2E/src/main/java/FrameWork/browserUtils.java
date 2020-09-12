package FrameWork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import global.data.utils.BrowserProperties;

public class browserUtils extends BrowserProperties {

	public WebDriver driver;

	public WebDriver initialiseDriver() throws IOException {

		String browserName = fetchDataBrowser("browser");
		String url = fetchDataBrowser("url");
      
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			driver.manage().deleteAllCookies();

		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "drivers//geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get(url);
			driver.manage().deleteAllCookies();
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "drivers//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.get(url);
			driver.manage().deleteAllCookies();
		} else if (browserName.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "drivers//msedgedriver.exe");
			driver = new EdgeDriver();
			driver.get(url);
			driver.manage().deleteAllCookies();
		} else {
			System.out.println("Browser given is not configured with this framework-----"
					+ "-We will work on this--Drop a mail to vs.anandkrishnan@outlook.com");
		}

		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		return driver;

	}

//public static void main(String[] args) throws IOException {
//    
//    initialiseDriver() ;
//}

}
