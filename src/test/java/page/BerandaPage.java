package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BerandaPage {

   private WebDriver driver;

   public BerandaPage(WebDriver driver) {
       this.driver = driver;
   }
   public void navigateToHomePage(){
       driver.navigate().to("https://app.caliana.id/vms");
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
       WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Beranda']")));
       assertTrue(element.isDisplayed());
      //System.out.println(element);
   }
}
