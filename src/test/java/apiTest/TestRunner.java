package apiTest;

import org.testng.TestNG;

public class TestRunner {
    public static void main(String[] args) {
        TestNG tng = new TestNG();
        tng.setTestClasses(new Class[] { ApiTest.class });
        tng.run();
    }
}
