package com.seleniumwebapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author usha s
 * How to get TagName, HTML attribute value,
 * Text, CSS value using selenium webDriver
 */
public class SeleniumWebElementProps {
    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        WebDriver driver=new ChromeDriver(options.addArguments("start-maximized"));
        driver.get("https://www.github.com/login");

        //TagName
        System.out.println(driver.findElement(By.name("commit")).getTagName());

        //GetAttribute
        System.out.println(driver.findElement(By.name("commit")).getAttribute("type"));

        //Get TextBox - Text
        WebElement usernameTxt=driver.findElement(By.id("login_field"));
        usernameTxt.sendKeys("Tenni");
        System.out.println(usernameTxt.getAttribute("value"));

        //GetCSS
        System.out.println(driver.findElement(By.name("commit")).getCssValue("background-color"));

        driver.quit();


    }
}
