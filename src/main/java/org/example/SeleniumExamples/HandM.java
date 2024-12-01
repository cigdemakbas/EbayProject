package org.example.SeleniumExamples;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class HandM {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www2.hm.com/en_us/index.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement cookie= driver.findElement(By.xpath("//*[@id='onetrust-accept-btn-handler']"));
        cookie.click();
        driver.switchTo().frame("attentive_creative");
        WebElement cont= driver.findElement(By.id("ctabutton1header1"));
        cont.click();
        WebElement email=driver.findElement(By.id("input1input"));
        email.click();
        email.sendKeys("cigdemtazegul@hotmail.com");
        WebElement enter=driver.findElement(By.id("ctabutton1header1"));
        enter.click();
        WebElement cell=driver.findElement(By.id("input0input"));
        cell.sendKeys("3478326804");
        WebElement cont1= driver.findElement(By.id("ctabutton1header1"));
        cont1.click();
        WebElement close= driver.findElement(By.id("closeIconSvg"));
        close.click();
        Thread.sleep(3000);

        WebElement woman= driver.findElement(By.xpath("(//a[@class='CGae __9y2v vEfo'][normalize-space()='Women'])[1]"));
        woman.click();

        WebElement woman1= driver.findElement(By.xpath("(//a[@class='CTA-module--action__1qN9s CTA-module--medium__1uoRl CTA-module--reset__1G6AO ListItem-module--link__1MuqR'][normalize-space()='View All'])[1]"));
        woman1.click();


        WebElement w= driver.findElement(By.xpath("//h2[normalize-space()='Bead-detail Crinkled Pants']"));
        Actions action= new Actions(driver);
        action.moveToElement(w).perform();
        WebElement w1= driver.findElement(By.xpath("//h2[normalize-space()='Bead-detail Crinkled Pants']"));
       w1.click();
        // action.click(w).perform();

        WebElement product= driver.findElement(By.xpath("//h1[normalize-space()='Bead-detail Crinkled Pants']"));
        String productName=product.getText();
        WebElement prPrice= driver.findElement(By.xpath("//span[@class='edbe20 ac3d9e d9ca8b']"));
        String pPrice=prPrice.getText();

        System.out.println("Product Name : "+ productName+"Product Price : "+pPrice);


  driver.close();


    }
}
