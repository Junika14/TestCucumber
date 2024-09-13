package stepdef;

import basetest.FoundationTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;

public class LoginStepDef extends FoundationTest {

    LoginPage loginPage;
    @Given("user in login page")
    public void userInLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();

    }

    @And("user input email with {string}")
    public void userInputEmailWith(String email) {
        loginPage.enterEmail(email);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginPage.enterPassword(password);
    }

    @When("user click Masuk button")
    public void userClickMasukButton() {
        loginPage.clickLoginButton();
    }

    @Then("error message appear")
    public void errorMessageAppear() {
        loginPage.validateEmailPassword();
    }
}
