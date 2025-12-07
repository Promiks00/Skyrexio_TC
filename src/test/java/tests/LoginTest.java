package tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class LoginTest {

    @Test
    void validLogin() {
        open("https://test.skyrexio.com/login");
        $("[placeholder='Email']").setValue("wheel64959@mriscan.live");
        $("[type='password']").setValue("JR7-iWB-j5q-SnK").pressEnter();
        $x("//div[normalize-space()='Главная']").shouldHave(text("Главная"));


    }
    void invalidLogin(String username, String password) {}
}
