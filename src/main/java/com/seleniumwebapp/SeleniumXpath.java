package com.seleniumwebapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
* @author usha s
* Xpaths- Absolute & Relative xpaths
 * Reative xpath by using Attributes
 *
*/
public class SeleniumXpath {
    static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        driver=new ChromeDriver(options.addArguments("start-maximized"));
        driver.get("https://www.w3schools.com/");

//         //Absolute-Xpath
//         highlight(driver,driver.findElement(By.xpath("/html/body/div[3]/a[3]")));
//
//         //Relative-Xpath
//         highlight(driver,driver.findElement(By.xpath("//a[@title='Exercises and Quizzes']")));
//
//         //Relative-Xpath
//         highlight(driver,driver.findElement(By.xpath("//a[@title=\"Login to your account\"]")));
        //xpathOperators();
        //xpathConditions();
        //xpathIndex();
        //xpathFunctions();
        xpathAxes();
    }
    public static void highlight(WebDriver webDriver, WebElement webElement){
        JavascriptExecutor javascriptExecutor= (JavascriptExecutor) webDriver;
        javascriptExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')",webElement);
    }

    public static void xpathOperators(){
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        highlight(driver, driver.findElement(By.xpath("//input[@maxlength>10]")));
    }
    public static void xpathConditions() throws InterruptedException {
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        highlight(driver, driver.findElement(By.xpath("//input[@maxlength=10 and @name='name']")));
        highlight(driver, driver.findElement(By.xpath("//input[@maxlength>0 or @name='name']")));

    }
    public static void xpathIndex() throws InterruptedException {
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        highlight(driver, driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")));

    }
    public static void xpathFunctions() throws InterruptedException {
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        highlight(driver, driver.findElement(By.xpath("//a[text()='Sign in']")));
        highlight(driver, driver.findElement(By.xpath("//a[contains(text(),'in into')]")));
        highlight(driver, driver.findElement(By.xpath("//div[contains(@id,'aswift_0')]")));
        highlight(driver, driver.findElement(By.xpath("//button[starts-with(text(),'Reg')]")));
        highlight(driver, driver.findElement(By.xpath("//label[normalize-space(text())='First Name']")));
        highlight(driver, driver.findElement(By.xpath("(//table/tbody/tr)[last()]")));
    }
    public static void xpathAxes() throws InterruptedException {
        driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
        highlight(driver, driver.findElement(By.xpath("//label[text()='Email']/following-sibling::input[@type='text']")));
//        highlight(driver, driver.findElement(By.xpath("//a[contains(text(),'in into')]")));
//        highlight(driver, driver.findElement(By.xpath("//div[contains(@id,'aswift_0')]")));
//        highlight(driver, driver.findElement(By.xpath("//button[starts-with(text(),'Reg')]")));
//        highlight(driver, driver.findElement(By.xpath("//label[normalize-space(text())='First Name']")));
//        highlight(driver, driver.findElement(By.xpath("(//table/tbody/tr)[last()]")));
    }

}
