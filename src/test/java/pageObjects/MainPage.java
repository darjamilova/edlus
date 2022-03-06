package pageObjects;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    String mainText = ".//div[@class='col content']/h1";

    public boolean isMainPageDisplayed() {
        return ($(byXpath(mainText)).isDisplayed() &&
                $(byXpath(mainText)).text().equals("LMT elektroniskā darbalaika uzskaite – EDLUS"));
    }


}
