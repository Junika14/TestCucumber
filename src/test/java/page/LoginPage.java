package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {

    WebDriver driver;

    By emailInputText = By.xpath("//input[@name='email']");
    By passwordInputText = By.xpath("//input[@name='password']");
    By loginButton = By.xpath("//button[@type='submit']");



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToLoginPage() {
        driver.get("https://app.caliana.id/auth");
    }

    public void enterEmail(String email) {
        driver.findElement(emailInputText).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInputText).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void validateEmailPassword() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement errmsg = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".swal2-title")));
    String errmsgText = errmsg.getText();
    assertTrue(errmsgText.contains("Email atau Kata Sandi salah"));
    }
}
