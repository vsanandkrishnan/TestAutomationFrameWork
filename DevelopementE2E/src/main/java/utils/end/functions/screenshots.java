package utils.end.functions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class screenshots {

	public  void takeScreenShots(WebDriver driver) throws IOException {
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File fin = ss.getScreenshotAs(OutputType.FILE);
		String loc = "screenshotsout//imageout.png";
		File fout = new File(loc);
		FileUtils.copyFile(fin, fout);
		
		
	}
	
}
