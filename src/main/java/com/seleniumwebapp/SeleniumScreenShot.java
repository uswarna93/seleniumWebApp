package com.seleniumwebapp;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;


public class SeleniumScreenShot {
    public static void main(String[] args) throws IOException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        //File- ChromeDriver
//        File sourceFile = driver.getScreenshotAs(OutputType.FILE);
//        File destFile = new File("./ScreenShot/img1.png");
//        FileUtils.copyFile(sourceFile,destFile);
//        System.out.println("Screenshot saved successfully");
//        driver.quit();

        //ByteArray-ChromeDriver
//        byte[] byteArray = driver.getScreenshotAs(OutputType.BYTES);
//        File destFile = new File("./ScreenShot/img2.jpg");
//        FileOutputStream fos=new FileOutputStream(destFile);
//        fos.write(byteArray);
//        fos.close();
//        System.out.println("Screenshot saved successfully");
//        driver.quit();

        //Base64-with Webdriver
        TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
        String base64Code = takesScreenshot.getScreenshotAs(OutputType.BASE64);
        byte[] byteArr = Base64.getDecoder().decode(base64Code);
        File destFile = new File("./ScreenShot/img3.jpg");
        FileOutputStream fos=new FileOutputStream(destFile);
        fos.write(byteArr);
        fos.close();
        System.out.println("Screenshot saved successfully");
        driver.quit();

    }
}
