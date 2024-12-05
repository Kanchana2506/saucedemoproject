package org.h2k.ecommernce.seleniumproject;

import org.apache.hc.client5.http.impl.classic.MainClientExec;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBrowerPaage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new  ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	String Title=driver.getTitle();
	System.out.println("PRint title of webpage "+Title);
	}
}
