package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PengaturanPage {
    WebDriver driver;
    WebDriverWait wait;
    String uploadedFilePath;
    String fileAcceptTypes;
    final long MAX_FILE_SIZE_MB = 1;

    public PengaturanPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        PageFactory.initElements(driver, this);
    }
    public void ClickPengaturan(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Pengaturan']")));
        element.click();
    }
    public void ClickPengaturanText(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("left-tabs-example-tab-management")));
        element.click();
    }
    public void ClickButtonUbah(){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Ubah']")));
        element.click();
    }
    public void ClickButtonPilihBerkas(){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Pilih Berkas']")));
        element.click();
    }
    public void uploadFile(String path){
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement fileInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='file']")));
        fileAcceptTypes = fileInput.getAttribute("accept");
        fileInput.sendKeys(path);
        uploadedFilePath = path;
//        try{
//            WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[type='file']")));
//            fileInput.sendKeys(path);
//        }catch(Exception e){
//            e.printStackTrace();
//        }

    }
    public void simpanFileMaks1MB() throws IOException{
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Simpan']")));
        element.click();
        File file = new File(uploadedFilePath);
        long fileSizeInBytes = Files.size(file.toPath());
        long fileSizeMB = fileSizeInBytes / (1024 * 1024);
        if (fileSizeMB <= MAX_FILE_SIZE_MB) {
            System.out.println("diterima");
        }else{
            System.out.println("tidak diterima");
        }
    }
}
