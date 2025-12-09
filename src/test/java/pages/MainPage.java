package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {
    private final SelenideElement statisticsHeader =
            $x("//h2[text()='Статистика']");

    public MainPage shouldSeeStatistics() {
        statisticsHeader.shouldHave(text("Статистика"));
        return this;
    }
}
