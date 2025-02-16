package com.ait.homework.homework2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class DemoWebShopCss {
    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }
    @Test
    public void openChromeTest() {
        System.out.println("Browser opens!");
    }
    @Test
    public void findElementByCssCelector() {
        driver.findElement(By.cssSelector("h2"));
        driver.findElement(By.cssSelector("title"));

        //id -> css - #    driver.findElement(By.id("city"));
        driver.findElement(By.cssSelector("#bar-notification"));
        //driver.findElement(By.cssSelector("#my-element"));

        //className -> css- .  driver.findElement(By.className("header"));
        driver.findElement(By.cssSelector(".list"));
        driver.findElement(By.cssSelector(".master-wrapper-page"));




         WebElement register = driver.findElement(By.cssSelector("[href='/register']"));
        System.out.println(register.getText());

        driver.findElement(By.cssSelector("[title='Error']"));

       driver.findElement(By.cssSelector("[class='close']"));
//        // contains-> *
       driver.findElement(By.cssSelector("[href*='/141']"));
//        //start with -> ^
       driver.findElement(By.cssSelector("[href^='/build']"));
//        // end on -> $ (/simple-computer)
        driver.findElement(By.cssSelector("[href$='le-computer']"));
         //  driver.findElement(By.cssSelector(".logo>img"));

        driver.findElement(By.cssSelector(".header-logo img"));
//        driver.findElement(By.cssSelector(".navigation-link:nth-child(5)"));
       driver.findElement(By.cssSelector(".inactive:nth-child(3)"));

//
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}


