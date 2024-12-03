package com.seleniumwebapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeleniumWebAppApplication {

	public static void main(String[] args) throws InterruptedException {

		SpringApplication.run(SeleniumWebAppApplication.class, args);

//		WebDriver edgeDriver= new EdgeDriver();
//		edgeDriver.get("https://www.microsoft.com/en-us/edge/");
//
//		WebDriver foxDriver= new FirefoxDriver();
//		foxDriver.get("https://www.mozilla.org");
		WebDriver chromedriver = new ChromeDriver();
		chromedriver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement webElement=chromedriver.findElement(By.id("login_field"));
		highlight(chromedriver,webElement);
		Thread.sleep(3000);
		highlight(chromedriver, chromedriver.findElement(By.name("password")));
		Thread.sleep(3000);
		highlight(chromedriver, chromedriver.findElement(By.className("header-logo")));
        Thread.sleep(3000);
		highlight(chromedriver, chromedriver.findElement(By.linkText("Forgot password?")));
		Thread.sleep(3000);
		highlight(chromedriver,chromedriver.findElement(By.partialLinkText("Create an")));
		Thread.sleep(3000);
		highlight(chromedriver,chromedriver.findElement(By.tagName("h1")));
		Thread.sleep(3000);
		highlight(chromedriver, chromedriver.findElement(By.xpath("//label[contains(text(),'Username or email address')]")));
		Thread.sleep(3000);
		highlight(chromedriver, chromedriver.findElement(By.cssSelector("input[name='commit']")));

		if (webElement.isDisplayed()){
			if (webElement.isEnabled()){
				webElement.sendKeys("Tenni");
				String enteredText= webElement.getAttribute("value");
				System.out.println(enteredText);
				Thread.sleep(3000);
				webElement.clear();
			}else {
				System.out.println("webElement is Enabled");
			}
		}else {
			System.out.println("webElement is Displayed");
		}
	}
	public static void highlight(WebDriver webDriver, WebElement webElement){
		JavascriptExecutor javascriptExecutor= (JavascriptExecutor) webDriver;
		javascriptExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')",webElement);
	}
}
