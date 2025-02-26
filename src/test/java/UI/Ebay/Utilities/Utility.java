package UI.Ebay.Utilities;



import UI.Ebay.Utilities.Libraries.library.FlowsLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utility extends FlowsLibrary {

    public static boolean isClickable(WebElement element, int waitTime) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(waitTime));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean isElementVisible(WebElement element, int waitTime) {
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(waitTime));
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void scrollTo(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView()", element);
    }

    public static void scrollToCenter(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView({block:\"center\"})", element);
    }

    public static void scrollByPixel(int number) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0," + number + ")");
    }

    public static void waits(long seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void hoverOver(WebElement element, int waitTime) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).pause(Duration.ofSeconds(waitTime)).build().perform();
        // actions.moveToElement(element).build().perform();
    }

    public void clickElement(WebElement element) {
        element.click();
    }
    public void clickElementByText(String text) {
        Driver.getDriver().findElement(By.xpath("//*[text()='" + text + "']")).click();;
    }


    public void clickElementByLinkText(String element) {
        Driver.getDriver().findElement(By.linkText(element)).click();
    }

    public void clickElementById(String element) {
        Driver.getDriver().findElement(By.id(element)).click();
    }

    public void clickElementByName(String element) {
        Driver.getDriver().findElement(By.name(element)).click();
    }

    public void clickElementByClassName(String element) {
        Driver.getDriver().findElement(By.className(element)).click();
    }

    public void clickElementButton(String element) {
        Driver.getDriver().findElement(By.xpath("//button[normalize-space()='" + element + "']")).click();
    }

    public void clickElementWithWait(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    public static void clickWithJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript("arguments[0].click();", element);
    }

    public void clearElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(element)).clear();
    }

    public void sendKeyToElement(WebElement element, String text) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public void selectElementByValue(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void selectElementByVisibleText(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);
    }

    public void selectElementByIndex(WebElement element, int index) {
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public String getTextElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(20));
        return wait.until(ExpectedConditions.visibilityOf(element)).getText();
    }

    public void sendKeyWithJSExecutor(WebElement element, String text) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        js.executeScript(("arguments[0].value=" + text + ";"), element);
    }

    public void switchToDefaultContent() {
        Driver.getDriver().switchTo().defaultContent();
    }

    public void switchToFrame(WebElement element) {
        Driver.getDriver().switchTo().frame(element);
    }

    public void switchToAlert(WebElement element) {
        Driver.getDriver().switchTo().alert().accept();
    }
}
