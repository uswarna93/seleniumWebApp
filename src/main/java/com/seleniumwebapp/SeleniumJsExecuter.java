package com.seleniumwebapp;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.w3c.dom.Document;

import javax.xml.crypto.dom.DOMCryptoContext;
/**
 * @author Usha S
 * JavaScriptExicuter Examples
 */

public class SeleniumJsExecuter {
    public static void main(String[] args) {
        ChromeOptions options= new ChromeOptions();
        WebDriver driver=new ChromeDriver(options.addArguments("start-maximized"));
        //Finding Elements
//        driver.get("https://www.facebook.com/login");
//        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
//        javascriptExecutor.executeScript("document.getElementById(\"email\").s.value='Usha';");
//        javascriptExecutor.executeScript("document.getElementById(\"pass\").value='Tenni';\n");
//        javascriptExecutor.executeScript("document.getElementById(\"loginbutton\").click();");

        //Scroll
        driver.get("https://www.hyrtutorials.com/");
        JavascriptExecutor javascriptExecutor=(JavascriptExecutor) driver;
        javascriptExecutor.executeScript("document.getElementsByClassName(\"ty_footer_copyright\")[1].scrollIntoView();");




    }
}
