package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;

public class FlightsPageLocator extends BaseClass {

	public static WebElement fromElement() {
		return driver.findElement(By.xpath("//input[@placeholder='From']"));
	}
	
	public static WebElement toElement() {
		return driver.findElement(By.xpath("//input[@placeholder='To']"));
	}
	
	public static WebElement searchElement() {
		return driver.findElement(By.xpath("//a[text()='Search']"));
	}
	
	
}
