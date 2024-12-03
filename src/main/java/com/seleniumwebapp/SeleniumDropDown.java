package com.seleniumwebapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
public class SeleniumDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        WebElement course=driver.findElement(By.id("course"));
        Select courseSelection=new Select(course);
        Thread.sleep(3000);
        courseSelection.selectByIndex(1);
        Thread.sleep(3000);
        courseSelection.selectByValue("net");
        Thread.sleep(3000);
        courseSelection.selectByVisibleText("Javascript");
        String dropdown1 = courseSelection.getFirstSelectedOption().getText();
        System.out.println("selected course: "+dropdown1);
        WebElement ide=driver.findElement(By.id("ide"));
        Select ideSelection=new Select(ide);
        ideSelection.selectByValue("ij");
        Thread.sleep(3000);
        ideSelection.selectByVisibleText("Eclipse");
        Thread.sleep(3000);
        ideSelection.selectByIndex(2);
        Thread.sleep(3000);
        ideSelection.selectByIndex(3);
        Thread.sleep(3000);
        ideSelection.deselectByIndex(3);
        Thread.sleep(3000);
        List<WebElement> allIdes = ideSelection.getAllSelectedOptions();
        System.out.println("All selected Ides: ");
        for (WebElement option: allIdes){
            System.out.println(option.getText());
        }

    }
}
