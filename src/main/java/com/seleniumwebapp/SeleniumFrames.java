package com.seleniumwebapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumFrames {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.findElement(By.id("name")).sendKeys("Text1"); //main doc
        driver.findElement(By.id("name")).clear();

        driver.switchTo().frame("frm1"); //frame1
        Select courseName_dd=new Select(driver.findElement(By.id("course")));
        courseName_dd.selectByVisibleText("Java");
        driver.switchTo().defaultContent();

        driver.findElement(By.id("name")).sendKeys("Text2");//main doc
        driver.findElement(By.id("name")).clear();

        driver.switchTo().frame("frm2"); //frame 2
        driver.findElement(By.id("lastName")).sendKeys("TENNI");


        driver.switchTo().defaultContent();//main doc
        driver.findElement(By.id("name")).sendKeys("Text3");
        driver.findElement(By.id("name")).clear();

        driver.switchTo().frame("frm1");// frame 1
        courseName_dd.selectByVisibleText("Dot Net");

        driver.switchTo().defaultContent();// main doc
        driver.findElement(By.id("name")).sendKeys("Text4");


    }
}
