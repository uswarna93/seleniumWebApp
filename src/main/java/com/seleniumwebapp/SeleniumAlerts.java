package com.seleniumwebapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        //Alert Box
        Thread.sleep(3000);
        System.out.println("first: "+driver.findElement(By.id("output")).getText());
        driver.findElement(By.id("alertBox")).click();
        Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        System.out.println("alert: "+driver.findElement(By.id("output")).getText());
        Thread.sleep(3000);

        //Confirmation Box
        driver.findElement(By.id("confirmBox")).click();
        Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        System.out.println("confirmation: "+driver.findElement(By.id("output")).getText());
        Thread.sleep(3000);

        //Prompt Box
        driver.findElement(By.id("promptBox")).click();
        Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Tenni");
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        System.out.println("promptBox: "+driver.findElement(By.id("output")).getText());
    }
}
