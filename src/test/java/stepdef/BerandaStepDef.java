package stepdef;

import basetest.FoundationTest;
import io.cucumber.java.en.Then;
import page.BerandaPage;

public class BerandaStepDef extends FoundationTest {
    BerandaPage berandaPage;
    @Then("user on Beranda page")
    public void userOnBerandaPage() {
        berandaPage = new BerandaPage(driver);
        berandaPage.navigateToHomePage();
    }
}
