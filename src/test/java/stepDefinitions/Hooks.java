package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Driver;
import utilities.DriverFactory;

import java.time.Duration;

public class Hooks {

        @Before
        public void setUp(){
            Driver.setDriver(DriverFactory.getDriver("CHROME"));
            Driver.getDriverInstance().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        }

        @After
        public void tearDown(){
            Driver.quitDriver();
        }
}
