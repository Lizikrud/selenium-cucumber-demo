package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import utilities.Driver;

public class LoginSteps {

    private WebDriver driver = Driver.getDriverInstance();

    private LoginPage loginPage = new LoginPage(driver);

    @Given("user navigates to Ukrainian Pages")
    public void user_navigates_to_ukrainian_pages() throws InterruptedException {
        driver.get("https://ukrainian-pages.com/en");
        Thread.sleep(4000);
        loginPage.accountLink.click();
    }
    @When("user logs in with username {string} and password {string}")
    public void user_logs_in_with_username_and_password(String string, String string2) throws InterruptedException {
        loginPage.login(string, string2);

    }
    @When("user clicks login button")
    public void user_clicks_login_button() throws InterruptedException {
        loginPage.signInButton.click();
        Thread.sleep(4000);

    }
    @Then("user is redirected to account page")
    public void user_is_redirected_to_home_page() {
        String actualTittle=driver.getTitle();
        String expected = "Account – Ukrainian Pages";
        Assert.assertEquals("Doesn't exist", expected, actualTittle);
        driver.quit();
    }


}
