package stepdef;

import basetest.FoundationTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class CucumberHook extends FoundationTest {

    @Before
    public void before() {
        getDriver();
    }
    @After
    public void after() {
        driver.close();
    }
}
