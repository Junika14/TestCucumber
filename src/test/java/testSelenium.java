
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class testSelenium {

    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.get("https://app.caliana.id/auth");
        driver.findElement(By.xpath("(//input)[1]")).sendKeys("tezdna@gmail.com");
        driver.findElement(By.xpath("(//input)[2]")).sendKeys("Password123!");
        driver.findElement(By.xpath("//button")).click();
        Thread.sleep(30);
        driver.findElement(By.xpath("//span[text()='Settings']")).click();
        Thread.sleep(30);
        driver.findElement(By.id("left-tabs-example-tab-management")).click();
        driver.findElement(By.xpath("//span[text()='Change']")).click();
        driver.findElement(By.xpath("//input[@name='logo']")).sendKeys("/Users/pintu/IdeaProjects/jayjay13/ppp.png");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(90);
        driver.findElement(By.id("left-tabs-example-tab-umum")).click();
        Thread.sleep(5);
        driver.findElement(By.id("left-tabs-example-tab-management")).click();
        Thread.sleep(60);
        driver.quit();
    }
}
