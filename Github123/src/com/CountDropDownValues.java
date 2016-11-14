package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CountDropDownValues {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\Selenium\\library\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://www.spicejet.com");
		
		String Str = driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).getText();
		String DDL[] = Str.split("\n");
		System.out.println("Dropdown values count : "+DDL.length);
		System.out.println("********************************************");
		System.out.println(Str);
		
		
	}

}
