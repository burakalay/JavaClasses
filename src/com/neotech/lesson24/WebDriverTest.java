package com.neotech.lesson24;

public class WebDriverTest {

	public static void main(String[] args) {
		// Runtime polymrphism
		// Method overriding
		// The driver will open the browser depending on the object
		// that has been created
		
		WebDriver driver = new ChromeDriver();
		driver.openBrowser();

	}

}
