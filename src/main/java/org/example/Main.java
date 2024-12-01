package org.example;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ebayAllCategoriesDropDown();
    }

    public static void ebayAllCategoriesDropDown() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement categories = driver.findElement(By.id("gh-cat"));
        Select list = new Select(categories);
        List<WebElement> categoriesList = list.getOptions();
        List<String> myList = new LinkedList<String>();
        myList.add("All Categories");
        myList.add("Antiques");
        myList.add("Art");
        myList.add("Baby");
        myList.add("Books");
        myList.add("Business & Industrial");
        myList.add("Cameras & Photo");
        myList.add("Cell Phones & Accessories");
        myList.add("Clothing, Shoes & Accessories");
        myList.add("Coins & Paper Money");
        myList.add("Collectibles");
        myList.add("Computers/Tablets & Networking");
        myList.add("Consumer Electronics");
        myList.add("Crafts");
        myList.add("Dolls & Bears");
        myList.add("DVDs & Movies");
        myList.add("eBay Motors");
        myList.add("Entertainment Memorabilia");
        myList.add("Gift Cards & Coupons");
        myList.add("Health & Beauty");
        myList.add("Home & Garden");
        myList.add("Jewelry & Watches");
        myList.add("Music");
        myList.add("Musical Instruments & Gear");
        myList.add("Pet Supplies");
        myList.add("Pottery & Glass");
        myList.add("Real Estate");
        myList.add("Specialty Services");
        myList.add("Sporting Goods");
        myList.add("Sports Mem, Cards & Fan Shop");
        myList.add("Stamps");
        myList.add("Tickets & Experiences");
        myList.add("Toys & Hobbies");
        myList.add("Travel");
        myList.add("Video Games & Consoles");
        myList.add("Everything Else");
        for (int i = 0; i < categoriesList.size(); i++) {
            String dropdownText = categoriesList.get(i).getText();
            list.selectByVisibleText(dropdownText);
            String expectedText = myList.get(i);

            if (dropdownText.equals(expectedText)) {
                System.out.println("Yes Match: " + dropdownText + " matches " + expectedText);
            } else {
                System.out.println("Mismatch: " + dropdownText + " does not match " + expectedText);
            }
        }
        driver.close();

    }
}


