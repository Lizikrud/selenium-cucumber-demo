package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {
    public LoginPage(WebDriver driver){

        PageFactory.initElements(Driver.getDriverInstance(),this);
    }

    @FindBy (xpath = "//a[@class='header__icon header__icon--account link focus-inset small-hide']")
    public WebElement accountLink;

    @FindBy (xpath = "//*[@id='CustomerEmail']")
    public WebElement username;

    @FindBy(xpath = "//*[@id='CustomerPassword']")
    public WebElement password;

    @FindBy(xpath = "/html/body/main/div/div/div[2]/form/button")
    public WebElement signInButton;

    public void login(String username, String password) throws InterruptedException {
        this.username.sendKeys(username);
        Thread.sleep(4000);
        this.password.sendKeys(password);
        Thread.sleep(4000);

    }

}
