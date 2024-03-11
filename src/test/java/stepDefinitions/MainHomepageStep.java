package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.Driver;

public class MainHomepageStep {
    private HomePage homePage;
    @Given("User should be landing on homepage Ukrainian Pages")
    //Go to URL
    public void user_should_be_landing_on_homepage_ukrainian_pages() throws InterruptedException {
        Driver.getDriverInstance().get("https://ukrainian-pages.com/en");
        Thread.sleep(2000);
        homePage = new HomePage();

    }


    @Then("User should see {string}")
    public void user_should_see(String string) {
      String expected = "Welcome to Ukrainian Pages";
      String actual = homePage.banner.getText();
      Assert.assertEquals("Banner doesn't correct", expected, actual);

    }

    @Given("Validate the Tittle")
    public void validate_the_tittle() {
        Driver.getDriverInstance().get("https://ukrainian-pages.com/en");
        String actualTitle = Driver.getDriverInstance().getTitle();
        System.out.println(actualTitle);
    }

}
