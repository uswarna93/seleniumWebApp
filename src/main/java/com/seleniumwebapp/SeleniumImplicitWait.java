package com.seleniumwebapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumImplicitWait {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
//        driver.findElement(By.id("btn1")).click();
//        driver.findElement(By.id("txt1")).sendKeys("Tenni");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10),Duration.ofMillis(2));
        driver.findElement(By.id("btn2")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
        driver.findElement(By.id("txt2")).sendKeys("Vish");
        Thread.sleep(3000);
        driver.quit();

    }
}
