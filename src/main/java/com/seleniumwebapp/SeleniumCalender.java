package com.seleniumwebapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumCalender {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options=new ChromeOptions();
        WebDriver driver=new ChromeDriver(options.addArguments("start-maximized"));
        int day=2;
        driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
        //driver.findElement(By.id("first_date_picker")).click();
       // driver.findElement(By.id("second_date_picker")).click();
        driver.findElement(By.id("second_date_picker")).click();
        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[.="+day+"]")).click();

        Thread.sleep(3000);
        //driver.quit();
    }
}
