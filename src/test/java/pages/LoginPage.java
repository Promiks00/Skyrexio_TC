package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private static final String TITLE_TEXT = "Войдите в свой аккаунт";

    private final SelenideElement title = $(byText(TITLE_TEXT));;
    private final SelenideElement emailInput = $("[placeholder='Email']");
    private final SelenideElement passwordInput = $("[type='password']");

    public LoginPage openLoginPage() {
        open("/login");
        title.shouldHave(text(TITLE_TEXT));
        return this;
    }

    public LoginPage setEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public LoginPage setPassword(String password) {
        passwordInput.setValue(password);
        return this;
    }

    public LoginPage pressEnterOnPassword() {
        passwordInput.pressEnter();
        return this;
    }
}
