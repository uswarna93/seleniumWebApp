package com.seleniumwebapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SeleniumMultiTabs {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        //single window
        String parentWindowHandle= driver.getWindowHandle();
        System.out.println("parent window "+parentWindowHandle+" "+ driver.getTitle());
        driver.findElement(By.id("newWindowBtn")).click();
        Thread.sleep(3000);
        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandle: windowHandles){
            driver.switchTo().window(windowHandle).manage().window().maximize();
            if (driver.getTitle().equals("Basic Controls - H Y R Tutorials")){
                driver.findElement(By.id("firstName")).sendKeys("Tenni");
                System.out.println("Child window: "+driver.findElement(By.id("firstName")).getAttribute("value"));
                Thread.sleep(3000);
                System.out.println(windowHandle+" "+driver.getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(parentWindowHandle);
        driver.findElement(By.id("name")).sendKeys("Tenni");
        System.out.println("parent window: "+driver.findElement(By.id("name")).getAttribute("value"));
        driver.quit();

    }

}
