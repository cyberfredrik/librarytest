package se.nackademin.selenidetest;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.BeforeClass;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    private static final String URL = "http://localhost:8090/librarytest";

    @BeforeClass
    public static void initialSetup() {
        System.setProperty("webdriver.gecko.driver", "/home/tester/seleniumdrivers/geckodriver");
        Configuration.browser = "gecko";
    }

    @Before
    public void setup() {
        open(URL);
    }

}
