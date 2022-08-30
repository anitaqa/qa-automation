package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import drivers.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/features", glue = "steps", tags = "@web", monochrome = true, dryRun = false, plugin = {
		"pretty", "html:target/cucumber-report.html" }, snippets = SnippetType.CAMELCASE

)

public class Execute extends DriversFactory {

	public static void openBrowser() {
		String url = "https://qa-test.avenuecode.io/users/sign_in";
		String browser = "Chrome";
		boolean headless = false;

		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			if (headless) {
				options.addArguments("--headless");
				options.addArguments("--disable-gpu");
				options.addArguments("--window-size=1400,800");
			}
			driver = new ChromeDriver(options);

		} else if (browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			FirefoxOptions options = new FirefoxOptions();
			if (headless) {
				options.addArguments("--headless");
				options.addArguments("--disable-gpu");
				options.addArguments("--window-size=1400,800");
			}
			driver = new FirefoxDriver(options);

		} else {
			System.out.println("Type Chrome or Firefox");

		}

		driver.get(url);
		driver.manage().window().maximize();
		System.out.println("Webpage opened successfully");

	}
	
	public static void quit() {
		driver.quit();
	}
	
	
	

}