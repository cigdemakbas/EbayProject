package org.example.SeleniumExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TheInternetFrame {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        String URL="https://the-internet.herokuapp.com/";
        driver.get(URL);
        Thread.sleep(3000);

        WebElement frame= driver.findElement(By.xpath("//a[@href='/frames']"));

    }
}
