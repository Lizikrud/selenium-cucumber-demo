package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class HomePage {

    public HomePage(WebDriver driver){

        PageFactory.initElements(Driver.getDriverInstance(),this);
    }

@FindBy(xpath = "//*[@class='banner__heading inline-richtext h1']")
    public WebElement banner;

@FindBy(xpath = "//*[contains(text(), 'MAKE A PURCHASE')]")
    public WebElement purchaseButton;



}
