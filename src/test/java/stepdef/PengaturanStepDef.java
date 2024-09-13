package stepdef;

import basetest.FoundationTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.LoginPage;
import page.PengaturanPage;

import java.io.IOException;
import java.time.Duration;

public class PengaturanStepDef extends FoundationTest {

    LoginPage loginPage;
    PengaturanPage pengaturanPage;

    @Given("user sucessesfully login with email {string} password {string}")
    public void userSucessesfullyLoginWithEmailPassword(String email, String password) {
        loginPage = new LoginPage(driver);
        loginPage.goToLoginPage();
        loginPage.enterEmail(email);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
    }
    @And("user clik Pengaturan menu")
    public void userClikPengaturanMenu() {
        pengaturanPage = new PengaturanPage(driver);
        pengaturanPage.ClickPengaturan();
    }

    @And("user click Pengaturan management text")
    public void userClickPengaturanManagementText() {
        pengaturanPage.ClickPengaturanText();
    }

    @And("user click Ubah button")
    public void userClickUbahButton() {
        pengaturanPage.ClickButtonUbah();
    }

    @And("user click Pilih Berkas button")
    public void userClickPilihBerkasButton() {
        pengaturanPage.ClickButtonPilihBerkas();
    }

    @When("user click Simpan button")
    public void userClickSimpanButton() {
        try {
            pengaturanPage.simpanFileMaks1MB();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @Then("user see confirmation pop up")
    public void userSeeConfirmationPopUp() {
    }


    @And("user upload file with path {string}")
    public void userUploadFileWithPath(String filePath) {
        pengaturanPage.uploadFile(filePath);
    }
}
