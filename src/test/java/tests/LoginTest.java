package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

public class LoginTest extends BaseTest {

    @Test
    void validLogin() {
        String email = "wheel64959@mriscan.live";
        String password = "JR7-iWB-j5q-SnK";

        new LoginPage()
                .openLoginPage()
                .setEmail(email)
                .setPassword(password)
                .pressEnterOnPassword();

        new MainPage()
                .shouldSeeStatistics();
    }
}
