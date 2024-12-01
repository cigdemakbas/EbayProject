package org.example.SeleniumExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class DropDownMenuSelect {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement dropDown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        Select list = new Select(dropDown);
        list.selectByVisibleText("Baby");
        WebElement searchBox = driver.findElement(By.id("gh-btn"));
        searchBox.click();


        Thread.sleep(3000);
        driver.close();
    }
}

