package methods;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import drivers.DriversFactory;

public class Methods extends DriversFactory{
	
	
	public void click(By element) {
		driver.findElement(element).click();

	}

	public void click(String atribute, String text) {
		driver.findElement(By.xpath("//" + atribute + "[text()='" + text + "']")).click();

	}

	public void scroll(int n1, int n2) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + n1 + ", " + n2 + ")");

	}

	public void type(By element, String text) {
		driver.findElement(element).sendKeys(text);

	}

	public void validateText(By element, String expectedText) {
		String capturedText = driver.findElement(element).getText();
		assertTrue(capturedText.contains(expectedText));

	}

	public void screenShot(String nameEvidence) {
		TakesScreenshot printScreen = (TakesScreenshot) driver;
		
		File srcFile = printScreen.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("./evidences/"+nameEvidence+".png");
		
		try {
			FileUtils.copyFile(srcFile, destFile);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
	}
	
}



