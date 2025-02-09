package com.ait.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class DemoWebShop {
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
    public void findElementByTagName() {
        List<WebElement> elements1 = driver.findElements(By.tagName("title"));
        System.out.println(elements1.size());

        WebElement element2 = driver.findElement(By.tagName("h2"));
        System.out.println(element2.getText());

        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());
    }

    @Test
    public void findElementById() {

        driver.findElement(By.id("bar-notification"));

        driver.findElement(By.id("dialog-notifications-success"));

        driver.findElement(By.id("dialog-notifications-error"));
    }

    @Test
    public void findElementByClassName() {
        driver.findElement(By.className("list"));

        List<WebElement> inactive = driver.findElements(By.className("inactive"));
        System.out.println(inactive.size());

        List<WebElement> listbox = driver.findElements(By.className("listbox"));
        System.out.println(listbox.size());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
