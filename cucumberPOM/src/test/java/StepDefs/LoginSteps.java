package StepDefs;

// LoginSteps.java

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    private WebDriver driver;
    private LoginPage loginPage;

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        // Initialize WebDriver and navigate to the login page
    	System.setProperty("webdriver.chrome.driver","C:/Users/Ajeet/eclipse-workspace/cucumberPOM/src/test/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        // Initialize the LoginPage class
        loginPage = new LoginPage(driver);
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("user should be logged in")
    public void user_should_be_logged_in() {
        // Add verification steps here if needed



    driver.quit();
    }
}
