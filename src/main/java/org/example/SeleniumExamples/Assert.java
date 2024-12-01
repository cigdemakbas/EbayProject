package org.example.SeleniumExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assert {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.ebay.com/");

        String title="Electronics, Cars, Fashion, Collectibles & More | eBay";
        String expectedTitle=driver.getTitle();
        org.junit.Assert.assertEquals("",title,expectedTitle);
        System.out.println(expectedTitle);
        System.out.println(title);


        driver.quit();
    }
}
