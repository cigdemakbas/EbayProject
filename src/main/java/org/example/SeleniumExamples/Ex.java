package org.example.SeleniumExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class Ex {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String url = "https://the-internet.herokuapp.com/";
        driver.get(url);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement newW = driver.findElement(By.xpath("//a[@href='/windows']"));
        newW.click();
        WebElement cl = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        cl.click();

        // Get the original window handle
        String currentWindow = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        System.out.println("Original Window ID: " + currentWindow);
  Thread.sleep(2000);
        for (String windowID : windows) {
            String title = driver.switchTo().window(windowID).getTitle();
            System.out.println("Window Title: " + title);
            if (title.equals("New Window")) {
                // Close the new window
                driver.close();
                break; // Exit the loop after closing the target window

            }
        }
        Thread.sleep(3000);
        // Switch back to the original window
        driver.switchTo().window(currentWindow);

        driver.quit();
    }
}
