package org.example.SeleniumExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class RecuiterWebPage {
    public static void main(String[] args) throws InterruptedException {
      /*  Scenario Description: You are tasked with automating the process of fetching and identifying prices of products listed on a website. You will use Java along with Selenium WebDriver to achieve this automation.
                Tasks:
        Open a web browser and navigate to a specific website (https://www.express.com/).
        Identify and locate all the product elements on the webpage.
        Write code to identify and extract prices of products.
                Print the name and price of each product to the console.
        Requirements:
        Use Java programming language.
        Utilize Selenium WebDriver for web automation.
        Handle any necessary waits or delays to ensure proper page loading.
                Implement error handling to manage cases where elements or prices cannot be found.*/


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        String URL="https://www.express.com/";
        driver.get(URL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement accept=driver.findElement(By.id("onetrust-accept-btn-handler"));
        accept.click();
        Thread.sleep(3000);


//        WebElement closeButton=driver.findElement(By.xpath("//button[@name='bluecoreCloseButton']"));
//        closeButton.click();
//        Thread.sleep(3000);

        WebElement closeTab=driver.findElement(By.className("allModalsLoaded"));
        closeTab.click();
     //   Thread.sleep(3000);

        WebElement womanSection=driver.findElement(By.xpath("//a[normalize-space()='Women']"));
        Actions action= new Actions(driver);
        action.moveToElement(womanSection).perform();
        womanSection.click();

      //  Thread.sleep(3000);

       WebElement shopNow=driver.findElement(By.xpath("//div[contains(@class,'padding- padding-vertical-12-px')]//a[contains(@class,'btn btn-underline btn-white')][normalize-space()='SHOP NOW']"));
       shopNow.click();
        Thread.sleep(3000);


       // WebElement closeButton=driver.findElement(By.className("close_button-374288-button close_button-374288-button-d2 close_button-374288-image close_button-374288-image-d3 bluecoreCloseButton"));
      //  driver.switchTo().frame(closeButton);
     //   closeButton.click();
       // Thread.sleep(3000);


        WebElement product=driver.findElement(By.xpath("(//a[normalize-space()='Relaxed Off The Shoulder Short Sleeve London Tee'])[1]"));
       action.moveToElement(product).perform();
        product.click();
        Thread.sleep(3000);

       WebElement product1=driver.findElement(By.xpath("//h1[normalize-space()='Relaxed Off The Shoulder Short Sleeve London Tee']"));
       String productName=product1.getText();
       String expectedProductName="Relaxed Off The Shoulder Short Sleeve London Tee";

       WebElement productPrice=driver.findElement(By.xpath("//p[@class='_4BABY']"));
       String productPrice1=productPrice.getText();

        System.out.println("This is Product Name : "+productName+", This is product price: "+productPrice1);
      //  Assert.assertEquals(expectedProductName,productName);
        Thread.sleep(2000);
        driver.close();

    }
}
