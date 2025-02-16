package com.ait.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoWebShopXpath {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @Test
    public void openChromeTest() {
        System.out.println("Browser opens!");
    }

    @Test
    public void findElementByXpath() {
        //  xpath -> //*[@key='value']
        //driver.findElement(By.tagName("h1"));
        driver.findElement(By.xpath("//h2"));

        //driver.findElement(By.id("city"));
        driver.findElement(By.xpath("//*[@id='bar-notification']"));

//        //driver.findElement(By.className("header"));
        driver.findElement(By.xpath("//*[@class='list']"));
        driver.findElement(By.xpath("//*[@class='master-wrapper-page']"));

        driver.findElement(By.xpath("//*[@title='Error']"));
        driver.findElement(By.xpath("//*[@href='/register']"));
        driver.findElement(By.xpath("//*[@class='close']"));

//        //contains text
        driver.findElement(By.xpath("//*[contains(.,'Welcome to our store')]"));
        //equals
        driver.findElement(By.xpath("//*[text()='Do you like nopCommerce?']"));


        //contains
        driver.findElement(By.xpath("//*[contains(@href,'/141')]"));
//        //starts with
        driver.findElement(By.xpath("//*[starts-with(@href,'/build')]"));
        driver.findElement(By.xpath("//*[text()='Log in']"));

        //parent
//        driver.findElement(By.xpath("//h1/.."));
//        driver.findElement(By.xpath("//h1/parent::*"));
//        driver.findElement(By.xpath("//h1/parent::div"));
        driver.findElement(By.xpath("//h2/.."));
        driver.findElement(By.xpath("//h2/parent::*"));
        driver.findElement(By.xpath("//h2/parent::div"));


        //ancestor
//        driver.findElement(By.xpath("//h1/ancestor::*"));//first ancestor
//        driver.findElement(By.xpath("//h1/ancestor::div"));//two steps below
//        driver.findElement(By.xpath("//h1/ancestor::div[2]"));//one step below
        driver.findElement(By.xpath("//*[@class='top-menu']"));//first ancestor???

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
