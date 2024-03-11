package StepDefinitions;

import Pages.HomePage;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MainHomepageStep {
    HomePage homePage;

    @Given("User should be landing on homepage Ukrainian Pages")
    //Go to URL
    public void user_should_be_landing_on_homepage_ukrainian_pages() throws InterruptedException {
        Driver.getDriver().get ("https://ukrainian-pages.com/en");
        Thread.sleep(2000);
        homePage = new HomePage();

    }


    @Then("User should see {string}")
    public void user_should_see(String string) {
      String expected = "Welcome to Ukranian Pages";
      String actual = homePage.banner.getText();
        Assert.assertTrue(homePage.banner.isDisplayed());
        Assert.assertEquals("Banner doesn't correct", expected, actual);

    }
}
