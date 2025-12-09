package tests;

import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

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
        $x("//h2[text()='Статистика']")
                .shouldHave(text("Статистика"));
    }

    void invalidLogin() {
    }


}
