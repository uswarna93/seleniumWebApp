package com.seleniumwebapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumBasics {
    public static void main(String[] args) {

         //Maximize browser after opening webBrowser
//        WebDriver drive=new ChromeDriver();
//        drive.manage().window().maximize();
//        drive.get("https://www.google.com/");
//
//        //Maximize browser By default before opening
//        ChromeOptions options=new ChromeOptions();
//        WebDriver driver=new ChromeDriver(options.addArguments("start-maximized"));
//        driver.get("https://www.google.com/");

        //Getting Application Properties
        ChromeOptions options=new ChromeOptions();
        WebDriver driver=new ChromeDriver(options.addArguments("start-maximized"));
        driver.get("https://www.selenium.dev/");

        //Get URL
        String url=driver.getCurrentUrl();
        System.out.println("current url: "+url);

        //Get Tittle
        String title=driver.getTitle();
        System.out.println("title: "+title);

        //Get Page Source
        String pageSource=driver.getPageSource();
        System.out.println("page Source: "+pageSource);

        driver.quit();

    }
}
