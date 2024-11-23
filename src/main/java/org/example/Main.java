package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        String arg0 = "Soap";
        Thread.sleep(2000);
        searchBox.sendKeys(arg0);
        Thread.sleep(2000);
        WebElement clickSB = driver.findElement(By.id("gh-btn"));
        clickSB.click();
        Thread.sleep(2000);
//        WebElement el= driver.findElement(By.xpath("//span[@class='gh-my-ebay__link gh-rvi-menu']"));
//el.click();
        String expectedTitle = "Soap for sale | eBay";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        System.out.println(expectedTitle);
        System.out.println(actualTitle);
        System.out.println("aaaaaaaa");


        Thread.sleep(3000);
        driver.close();
    }
    }