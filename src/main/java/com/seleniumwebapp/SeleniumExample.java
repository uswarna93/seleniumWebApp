package com.seleniumwebapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Component;
@Component
public class SeleniumExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver chromedriver = new ChromeDriver();
        chromedriver.get("https://www.hyrtutorials.com/p/basic-controls.html#google_vignette");
        Thread.sleep(3000);
         chromedriver.findElement(By.id("femalerb")).click();
        Thread.sleep(3000);
         chromedriver.findElement(By.id("englishchbx")).click();
        Thread.sleep(3000);
         boolean selected=chromedriver.findElement(By.id("hindichbx")).isSelected();
         if (!selected){
             chromedriver.findElement(By.id("hindichbx")).click();
         }
         chromedriver.findElement(By.id("registerbtn")).click();
         String msg=chromedriver.findElement(By.id("msg")).getText();
        System.out.println(msg);
    }
}
