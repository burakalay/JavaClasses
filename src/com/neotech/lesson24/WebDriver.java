package com.neotech.lesson24;

public class WebDriver {

	public void openBrowser()
	{
		System.out.println("Open browser");
	}
	
}

class ChromeDriver extends WebDriver{
	@Override
	public void openBrowser()
	{
		System.out.println("Open Chrome browser");
	}
	
}
class FirefoxDriver extends WebDriver{
	@Override
	public void openBrowser()
	{
		System.out.println("Open firefox browser");
	}
}
class InternetExplorerDriver extends WebDriver {
	@Override
	public void openBrowser() 
	
	{
		System.out.println("Open IE browser");
	}
	
}
