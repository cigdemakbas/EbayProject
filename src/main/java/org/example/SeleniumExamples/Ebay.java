package org.example.SeleniumExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Ebay {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement jewelery= driver.findElement(By.xpath("(//a[@href='https://www.ebay.com/b/Jewelry-Watches/281/bn_1865273'])[2]"));
        Actions actions= new Actions(driver);
        actions.moveToElement(jewelery).perform();
        Thread.sleep(2000);
        driver.close();
    }
}
