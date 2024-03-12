package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import utilities.Driver;

public class MainHomepageStep {

    private WebDriver driver = Driver.getDriverInstance();
    private HomePage homePage = new HomePage(driver);

    @Given("User should be landing on homepage Ukrainian Pages")
    //Go to URL
    public void user_should_be_landing_on_homepage_ukrainian_pages()  {
        driver.get("https://ukrainian-pages.com/en");


    }

    @Then("User should see {string}")
    public void user_should_see(String expectedBanner) {
      String actual = homePage.banner.getText();
      Assert.assertEquals("Banner doesn't correct", expectedBanner, actual);

    }

    @Given("Validate the Tittle")
    public void validate_the_tittle() {
        String actualTitle = Driver.getDriverInstance().getTitle();
        System.out.println(actualTitle);
    }

}
