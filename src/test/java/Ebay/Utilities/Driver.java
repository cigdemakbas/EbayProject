package Ebay.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

     static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();

    private Driver() {
        // Private constructor to prevent instantiation
    }

    public static WebDriver getDriver() {
        if (driverPool.get() == null) {
            String browser = System.getProperty("browser") != null ? System.getProperty("browser") : ConfigReader.getProperty("browser");

            switch (browser.toLowerCase()) {
                case "chrome" -> {
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.addArguments("--remote-allow-origins=*");
                    driverPool.set(new ChromeDriver(chromeOptions));
                }
                case "firefox" -> {
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    driverPool.set(new FirefoxDriver(firefoxOptions));
                }
                case "edge" -> {
                    WebDriverManager.edgedriver().setup();
                    driverPool.set(new EdgeDriver());
                }
                case "safari" -> {
                    if (!System.getProperty("os.name").toLowerCase().contains("mac")) {
                        throw new RuntimeException("Safari is only supported on macOS");
                    }
                    driverPool.set(new SafariDriver());
                }
                default -> {
                    System.out.println("Browser not supported, launching Chrome as default");
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                }
            }
        }
        return driverPool.get();
    }

    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit();
            driverPool.remove();
        }
    }
}