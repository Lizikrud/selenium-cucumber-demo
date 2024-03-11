package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriverInstance(),this);
    }

@FindBy(xpath = "//*[contains(text(), 'Welcome')]")
    public WebElement banner;

@FindBy(xpath = "//*[contains(text(), 'MAKE A PURCHASE')]")
    public WebElement purchaseButton;



}
