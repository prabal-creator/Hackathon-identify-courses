package GridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//1.define desired capabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		
		//2.Chrome Options definition
		
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		//3.address of hub/url
		String hubUrl="http://localhost:3333/wd/hub";
		WebDriver driver= new RemoteWebDriver(new URL(hubUrl),options);
		
		driver.get("http://www.udemy.com");
		
		driver.quit();

	}

}