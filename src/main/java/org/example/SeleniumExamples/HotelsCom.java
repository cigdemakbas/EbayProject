package org.example.SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HotelsCom {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hotels.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));


        WebElement text = driver.findElement(By.xpath("//*[@id=\"lodging_search_form\"]/div/div/div[1]/div/div/div[2]/div[1]/button"));
        text.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"destination_form_field\"]")).sendKeys("Orlando");
        Thread.sleep(1000);
        List<WebElement> boxes = driver.findElements(By.className("uitk-typeahead-result-item-container"));
        System.out.println("boxes.size() = " + boxes.size());// uitk-action-list-item-content

        for (WebElement box : boxes) {
            System.out.println("box.getText() = " + box.getText());
            System.out.println("box.getText().equalsIgnoreCase(\"Orlando\") = " + box.getText().equalsIgnoreCase("Orlando"));
            if (box.getText().trim().contains("Orlando")) {
                box.click();
                break;
            }
        }


        Thread.sleep(1000);
//driver.quit();
    }


}
