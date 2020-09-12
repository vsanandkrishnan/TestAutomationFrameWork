package global.data.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BrowserProperties {

	public  String fetchDataBrowser(String browserData) throws IOException {

		Properties prop = new Properties();
		FileInputStream fin = new FileInputStream("data//browser.properties");
		prop.load(fin);
		String browserResults = prop.getProperty(browserData);
		return browserResults;

	}

}
