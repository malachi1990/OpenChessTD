package org.openchessTD.online.beans;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public enum Browser {
	FIREFOX("firefox"), CHROME("Chrome");
	
	private String browserChoice;
	
	private Browser(String choice){
		this.browserChoice = choice;
	}
	
	public RemoteWebDriver getDriver(Browser choice){
		RemoteWebDriver driver = null;
		switch (choice){
			case CHROME:
			case FIREFOX:
			default:
				driver = new FirefoxDriver();
		}
		return driver;
		
	}
	
}
