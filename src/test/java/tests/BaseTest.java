package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    @BeforeMethod
    static void beforeMethod() {
        Configuration.baseUrl = "https://test.skyrexio.com";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 8000;
        Configuration.pageLoadTimeout = 20000;
    }
}
