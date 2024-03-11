package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;

    private Driver(){}

    public static WebDriver getDriverInstance(){
        if(driver == null){
            driver = new ChromeDriver();
        }
        return driver;
    }

    // Optional methods
    public static void setDriver(WebDriver driverType){
        if(driver != null){
            System.out.println("Overwrite the driver instance.");
        }
        driver = driverType;
    }
    public static void quitDriver(){
        if(driver == null){
            System.out.println("The driver is already closed");
        }
        driver.quit();
    }


}
