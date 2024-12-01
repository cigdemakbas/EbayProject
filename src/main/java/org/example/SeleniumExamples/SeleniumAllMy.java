package org.example.SeleniumExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SeleniumAllMy {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.ebay.com/");
        WebElement dropDown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        WebElement elementSearchBox = driver.findElement(By.xpath("//select[@id='gh-cat']"));


        // My shortcuts :
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        Select list= new Select(dropDown);
        list.selectByVisibleText("text");
        list.selectByValue("value");
        list.selectByIndex(1);

        Alert alert= driver.switchTo().alert();
        alert.dismiss();
        alert.accept();
        alert.getText();

        Actions action= new Actions(driver);
        action.click(elementSearchBox).perform();

        driver.switchTo().frame(12);
        driver.switchTo().parentFrame();
        driver.switchTo().defaultContent();

        elementSearchBox.click();
        elementSearchBox.isEnabled();
        elementSearchBox.isDisplayed();
        elementSearchBox.isSelected();


        Thread.sleep(3000);
        driver.close();
    }
}
