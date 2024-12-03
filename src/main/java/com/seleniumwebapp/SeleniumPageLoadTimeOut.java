package com.seleniumwebapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class SeleniumPageLoadTimeOut {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Instant startTime = Instant.now();
        System.out.println(startTime.toString());
        driver.get("Https://WWW.google.com/");
        Instant endTime = Instant.now();
        System.out.println(endTime.toString());
        Duration duration = Duration.between(startTime, endTime);
        System.out.println("load time: "+duration.toSeconds()+" seconds");
        driver.getTitle();
        driver.quit();
    }
}
