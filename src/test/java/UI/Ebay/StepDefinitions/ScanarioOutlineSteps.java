package UI.Ebay.StepDefinitions;

import UI.Ebay.Elements.SearchBoxElements;
import UI.Ebay.Utilities.Driver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.Map;

public class ScanarioOutlineSteps extends SearchBoxElements {

    @And("User enter the")
    public void userEnterThe(Map<String, String > item) {
        String keyword= item.get("KeyWord");
        String dropdown=item.get("DropDown");

    searchBox.sendKeys(keyword);

        WebElement categories = Driver.getDriver().findElement(By.id("gh-cat"));
        categories.click();
        Select list = new Select(categories);
        list.selectByVisibleText(dropdown);
        Actions action= new Actions(Driver.getDriver());
        action.scrollToElement(clickSB).perform();
        clickSB.click();

    }
}
