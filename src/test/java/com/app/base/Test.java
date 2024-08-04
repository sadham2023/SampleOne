package com.app.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        System.out.println("Sample");
        WebDriver driver = new ChromeDriver();
        driver.get("https://github.com/");
        System.out.println("Browser open now");
        driver.close();
    }
}
