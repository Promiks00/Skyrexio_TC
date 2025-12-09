package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {
    private static final String TITLE_TEXT = "Войдите в свой аккаунт";
    private static final String TITLE_XPATH = "//p[contains(text(), '" + TITLE_TEXT + "')]";
    private static final String EMAIL_SELECTOR = "[placeholder='Email']";
    private static final String PASSWORD_SELECTOR = "[type='password']";

    private final SelenideElement title = $x(TITLE_XPATH);
    private final SelenideElement emailInput = $(EMAIL_SELECTOR);
    private final SelenideElement passwordInput = $(PASSWORD_SELECTOR);


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
