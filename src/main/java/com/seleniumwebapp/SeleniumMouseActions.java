package com.seleniumwebapp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

/**
 * @author Usha s
 * How to perform below operations using Selenium Webdriver?
 * MoveToElement or MouseHover,
 * Click, Double Click,
 * Right click or Context Click.
 */
public class SeleniumMouseActions {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        WebDriver driver=new ChromeDriver(options.addArguments("start-maximized"));
        Actions actions=new Actions(driver);
//        driver.get("https://forum.uipath.com/t/how-to-mouse-hover-on-drop-down-menu/111336");
//        driver.findElement(By.xpath("//button[.='Community']")).click();
//        Thread.sleep(3000);
//        //driver.switchTo().alert().dismiss();
//        Actions actions=new Actions(driver);
//        //WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5),Duration.ofMillis(2));
//        Thread.sleep(3000);
//        actions.moveToElement(driver.findElement(By.xpath("//a[.='GitHub']"))).click().perform();
        //driver.findElement(By.xpath("//input[@name='commit']")).click();

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        actions.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).perform();
        driver.findElement(By.xpath("//li[.='Copy']")).click();
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        Thread.sleep(3000);
        driver.quit();

    }
}
